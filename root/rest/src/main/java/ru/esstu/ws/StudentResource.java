package ru.esstu.ws;

import ru.esstu.se.model.Student;
import ru.esstu.ws.service.StudentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/student")
public class StudentResource {

    @GET
    @Produces("application/json")
    public List<Student> getAllStudent() {
        List<Student> students = StudentService.getAll();
        if (students == null) {
            throw new RuntimeException("Студентов нету!");
        }
        return students;
    }

}
