package ru.esstu.se.service.i;

import java.util.List;

public interface Service<T> {

    T getById(int id);

    T add(T domain);

    void update(T domain);

    void delete(int id);

    List<T> getAll();

}
