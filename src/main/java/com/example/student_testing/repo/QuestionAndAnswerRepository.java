package com.example.student_testing.repo;

import com.example.student_testing.models.QuestionAndAnswer;
import com.example.student_testing.models.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionAndAnswerRepository extends JpaRepository<QuestionAndAnswer, Long> {
    List<QuestionAndAnswer> getQuestionAndAnswersByTest(Test test);
}
