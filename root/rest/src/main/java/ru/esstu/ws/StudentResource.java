package ru.esstu.ws;

import ru.esstu.se.model.Student;
import ru.esstu.se.service.impl.StudentServiceImpl;
import ru.esstu.ws.service.StudentService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/student")
public class StudentResource {

//    private final StudentServiceImpl studentService;
//
//    @Inject
//    public StudentResource(StudentServiceImpl studentService) {
//        this.studentService = studentService;
//    }
//
//
//    @GET
//    @Produces
//    public Student getAll() {
//        return (Student) studentService.getAll();
//    }
//
//    @GET
//    @Path(value = "s/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Student getStudent(@PathParam("id") int id) {
//        return (Student) studentService.getById(id);
//    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Student> getAllStudent() {
        List<Student> students = StudentService.get();
        if (students == null) {
            throw new RuntimeException("Студентов нету!");
        }
        return students;
    }


}
