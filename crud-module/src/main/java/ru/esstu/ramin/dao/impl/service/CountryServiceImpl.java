package ru.esstu.ramin.dao.impl.service;

import ru.esstu.ramin.dao.abst.AbstractService;
import ru.esstu.ramin.dao.impl.dao.CountryDaoImpl;

public class CountryServiceImpl<Country> extends AbstractService {
    public CountryServiceImpl() {
        dao = new CountryDaoImpl<>();
    }
}
