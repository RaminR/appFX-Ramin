package ru.esstu.se.service.impl;

import ru.esstu.se.service.AbstractService;
import ru.esstu.se.dao.impl.RegionDaoImpl;

public class RegionServiceImpl<Region> extends AbstractService {
    public RegionServiceImpl() {
        dao = new RegionDaoImpl<>();
    }
}
