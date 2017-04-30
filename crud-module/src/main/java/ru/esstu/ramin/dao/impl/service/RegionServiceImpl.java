package ru.esstu.ramin.dao.impl.service;

import ru.esstu.ramin.dao.abst.AbstractService;
import ru.esstu.ramin.dao.impl.dao.RegionDaoImpl;

public class RegionServiceImpl<Region> extends AbstractService {
    public RegionServiceImpl() {
        dao = new RegionDaoImpl<>();
    }
}
