package com.sumeet.student_app.service;


import com.sumeet.student_app.model.Student;
import com.sumeet.student_app.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Student> getStudents(){
        return repo.findAll();
    }
}
