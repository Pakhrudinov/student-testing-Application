package com.example.student_testing.repo;

import com.example.student_testing.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long > {
}
