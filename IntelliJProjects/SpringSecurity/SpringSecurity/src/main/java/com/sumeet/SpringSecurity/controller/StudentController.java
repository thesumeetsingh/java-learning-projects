package com.sumeet.SpringSecurity.controller;


import com.sumeet.SpringSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> studentList= new ArrayList<>(List.of(
            new Student(1, "sumeet", 10),
            new Student(2, "tapesh", 9),
            new Student(3, "abhijeet", 9)
    ));


    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentList;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        studentList.add(student);
        return student;
    }
}
