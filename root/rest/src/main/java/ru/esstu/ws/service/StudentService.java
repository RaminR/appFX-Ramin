package ru.esstu.ws.service;

import ru.esstu.se.model.Student;
import ru.esstu.se.service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static StudentServiceImpl studentService = new StudentServiceImpl();
//    private static

    public static List<Student> getAll() {

//        students = studentService.getAll();
//        List<Student> studentList = new ArrayList<>();
//        for (Student student : students)
//            studentList.add(new Student(student.getId(), student.getFirstname(), student.getSurname()));
//
//        return studentList;
        List<Student> students = new ArrayList<>();
        Student student = new Student(1, "as", "as");
        students.add(student);
        return students;
    }

}
