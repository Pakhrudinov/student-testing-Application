package com.example.student_testing.repo;

import com.example.student_testing.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long > {
}
