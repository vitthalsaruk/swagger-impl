package com.swagger.controller;

import com.swagger.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stud")
public class Controller {

    List<Student> students = new ArrayList<Student>();

    @GetMapping("/all")
    public List<Student> getAllStudents() {

        System.out.print("test");
        return students;
    }

    @GetMapping(params = "s")
    public List<Student> getAllStudentsWithS(@RequestParam("s") String s) {

        System.out.print("test"+s);
        return students;
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student stud) {
        students.add(stud);
        return stud;
    }
}
