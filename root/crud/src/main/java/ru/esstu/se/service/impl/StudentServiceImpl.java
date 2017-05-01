package ru.esstu.se.service.impl;

import ru.esstu.se.service.AbstractService;
import ru.esstu.se.dao.impl.StudentDaoImpl;

public class StudentServiceImpl<Student> extends AbstractService {
    public StudentServiceImpl() {
        dao = new StudentDaoImpl<>();
    }
}
