package ru.esstu.se.service.impl;

import ru.esstu.se.service.AbstractService;
import ru.esstu.se.dao.impl.CountryDaoImpl;

public class CountryServiceImpl<Country> extends AbstractService {
    public CountryServiceImpl() {
        dao = new CountryDaoImpl<>();
    }
}
