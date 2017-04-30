package ru.esstu.ramin.dao.impl.service;


import ru.esstu.ramin.dao.abst.AbstractService;
import ru.esstu.ramin.dao.impl.dao.StudentDaoImpl;

public class StudentServiceImpl<Student> extends AbstractService {
    public StudentServiceImpl() {
        dao = new StudentDaoImpl<>();
    }
}
