package com.example.student_testing.repo;

import com.example.student_testing.models.QuestionsAndAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsAndAnswerRepository extends JpaRepository<QuestionsAndAnswer, Long> {
}
