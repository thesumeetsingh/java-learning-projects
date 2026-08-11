package com.sumeet.student_app.repo;

import com.sumeet.student_app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
