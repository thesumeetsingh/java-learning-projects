package com.sumeet.student_app.controller;


import com.sumeet.student_app.model.Student;
import com.sumeet.student_app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/allstudents")
    public List<Student> getStudents(){
//        return List.of(
//                new Student(1, "sumeet singh", 23),
//                new Student( 2, "rahul", 34),
//                new Student(3, "navin reddy", 30)
//        );

        return service.getStudents();
    }
}