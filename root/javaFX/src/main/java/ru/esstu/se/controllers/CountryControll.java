package ru.esstu.se.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import ru.esstu.se.alert.AlertBox;
import ru.esstu.se.model.Country;
import ru.esstu.se.service.impl.CountryServiceImpl;

import java.util.List;

public class CountryControll {

    @FXML
    private TextField idTxt, countryTxt;
    @FXML
    private TableView<Country> countryTb;
    @FXML
    private TableColumn<Country, Integer> idTc;
    @FXML
    private TableColumn<Country, String> countryTc;

    private AlertBox alert = new AlertBox();
    private CountryServiceImpl countryService = new CountryServiceImpl();
    private List<Country> allCountry;
    private ObservableList<Country> countries;

    @FXML
    private void initialize() {
        viewCountry();
    }

    public void viewCountry() {
        allCountry = countryService.getAll();
        countries = FXCollections.observableArrayList();
        countryTb.setItems(null);

        for (Country country : allCountry) {
            countries.add(new Country(country.getId(), country.getName()));
        }

        countryTb.setItems(countries);
        idTc.setCellValueFactory(new PropertyValueFactory<Country, Integer>("id"));
        countryTc.setCellValueFactory(new PropertyValueFactory<Country, String>("name"));
    }

    public void add(ActionEvent actionEvent) {
        if (countryTxt.getText().length() > 0) {
            Country country = new Country();
            country.setName(countryTxt.getText());
            countryService.add(country);

            viewCountry();
            alert.setAlertInfo("Поздравляю!", "Новая страна успешно добавлен в БД!", countryTxt.getText());
        } else {
            alert.setAlertWarning("Предупреждение!", "Поле '№' является не обязательным.", "Не все поля заполнены!");
        }
    }

    public void delete(ActionEvent actionEvent) {
        if (idTxt.getText().length() > 0) {
            countryService.delete(Integer.parseInt(idTxt.getText()));
            viewCountry();
            alert.setAlertInfo("Поздравляю!", "Страна под №: " + idTxt.getText() + ". была удалена из БД!", null);
        } else {
            alert.setAlertWarning("Предупреждение!", "Поле '№' является обязательным.", "Удаление происходит по выбору порядкового номера '№'!");
        }
    }

    public void update(ActionEvent actionEvent) {
        if (countryTxt.getText().length() > 0) {
            Country country = (Country) countryService.getById(Integer.parseInt(idTxt.getText()));
            country.setName(countryTxt.getText());
            countryService.update(country);

            viewCountry();
            alert.setAlertInfo("Поздравляю!", "Страна была изменена.", null);
        } else {
            alert.setAlertWarning("Предупреждение!", "Поле '№' является обязательным.", "Удаление происходит по выбору порядкового номера '№'!");
        }
    }

    public void pick(MouseEvent mouseEvent) {
        countryTb.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                idTxt.setText(String.valueOf(countryTb.getSelectionModel().getSelectedItem().getId()));
                countryTxt.setText(String.valueOf(countryTb.getSelectionModel().getSelectedItem().getName()));
            }
        });
    }
}
