package com.example.student_testing.Service;

import com.example.student_testing.models.Question;
import com.example.student_testing.models.QuestionAndAnswer;
import com.example.student_testing.models.Student;
import com.example.student_testing.models.Test;

import java.util.List;

public interface Service {
    List<Test> findAllTest();

    Test saveTest(Test test);

    Test getByIdTest(Long id);

    void deleteByIdTest(Long id);


    List<Student> findAllStudent();

    Student saveStudent(Student student);

    Student getByIdStudent(Long id);

    void deleteByIdStudent(Long id);


    List<QuestionAndAnswer> findAllQAA();

    QuestionAndAnswer saveQAA(QuestionAndAnswer QAA);

    QuestionAndAnswer getByIdQAA(Long id);

    void deleteByIdQAA(Long id);

    List<QuestionAndAnswer> getQuestionAndAnswersByTest(Test test);


    List<Question> findAllQuestion();

    Question saveQuestion(Question question);

    Question getByIdQuestion(Long id);

    void deleteByIdQuestion(Long id);






}
