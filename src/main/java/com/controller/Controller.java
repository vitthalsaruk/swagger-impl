package com.controller;

import com.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class Controller {

    List<Student> students = new ArrayList<Student>();

    @GetMapping
    public List<Student> getAllStudents() {

        System.out.print("test");
        return students;
    }

    @GetMapping(params = "s")
    public List<Student> getAllStudentsWithS(@RequestParam("s") String s) {

        System.out.print("test"+s);
        return students;
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student stud) {
        students.add(stud);
        return stud;
    }
}
