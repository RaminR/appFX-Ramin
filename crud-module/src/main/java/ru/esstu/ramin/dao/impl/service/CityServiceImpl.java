package ru.esstu.ramin.dao.impl.service;

import ru.esstu.ramin.dao.abst.AbstractService;
import ru.esstu.ramin.dao.impl.dao.CityDaoImpl;

public class CityServiceImpl<City> extends AbstractService {
    public CityServiceImpl() {
        dao = new CityDaoImpl<>();
    }
}
