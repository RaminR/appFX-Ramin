package ru.esstu.se.service.impl;

import ru.esstu.se.service.AbstractService;
import ru.esstu.se.dao.impl.CityDaoImpl;

public class CityServiceImpl<City> extends AbstractService {
    public CityServiceImpl() {
        dao = new CityDaoImpl<>();
    }
}
