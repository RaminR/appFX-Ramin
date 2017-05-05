package ru.esstu.ws.service;

import ru.esstu.se.model.Student;
import ru.esstu.se.service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public static List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Имя", "Фамилия"));
        students.add(new Student(2, "Имя", "Фамилия"));
        students.add(new Student(3, "Имя", "Фамилия"));
        return students;
    }

    private static List<Student> studentList = new ArrayList<>();
    private static StudentServiceImpl studentService = new StudentServiceImpl();

    public static List<Student> get() {
        studentList = studentService.getAll();
        return studentList;
    }
}
