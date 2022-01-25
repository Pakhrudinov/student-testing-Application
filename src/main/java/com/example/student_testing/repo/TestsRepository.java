package com.example.student_testing.repo;

import com.example.student_testing.models.Tests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestsRepository extends JpaRepository<Tests, Long> {

}
