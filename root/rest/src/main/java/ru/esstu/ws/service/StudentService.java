package ru.esstu.ws.service;

import ru.esstu.se.model.Student;
import ru.esstu.se.service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static StudentServiceImpl studentService = new StudentServiceImpl();
    private static List<Student> students;

    static {
        students = new ArrayList();
        students.add(new Student(1, "Имя", "Фамилия"));
        students.add(new Student(2, "Имя", "Фамилия"));
    }


    public static List<Student> getAll() {
        return students;
    }

}
