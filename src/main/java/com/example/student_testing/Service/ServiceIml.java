package com.example.student_testing.Service;

import com.example.student_testing.models.Question;
import com.example.student_testing.models.QuestionAndAnswer;
import com.example.student_testing.models.Student;
import com.example.student_testing.models.Test;
import com.example.student_testing.repo.QuestionAndAnswerRepository;
import com.example.student_testing.repo.QuestionRepository;
import com.example.student_testing.repo.StudentRepository;
import com.example.student_testing.repo.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceIml implements com.example.student_testing.Service.Service {
    private final TestRepository testRepository;
    private final StudentRepository studentRepository;
    private final QuestionAndAnswerRepository questionAndAnswerRepository;
    private final QuestionRepository questionRepository;

    public ServiceIml(TestRepository testRepository, StudentRepository studentRepository, QuestionAndAnswerRepository questionAndAnswerRepository, QuestionRepository questionRepository) {
        this.testRepository = testRepository;
        this.studentRepository = studentRepository;
        this.questionAndAnswerRepository = questionAndAnswerRepository;
        this.questionRepository = questionRepository;
    }


    @Override
    public List<Test> findAllTest() {

        return testRepository.findAll();
    }

    @Override
    public Test saveTest(Test test) {

        return testRepository.save(test);
    }

    @Override
    public Test getByIdTest(Long id) {
        return testRepository.getById(id);
    }

    @Override
    public void deleteByIdTest(Long id) {
        testRepository.deleteById(id);
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public Student getByIdStudent(Long id) {
        return studentRepository.getById(id);
    }

    @Override
    public void deleteByIdStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<QuestionAndAnswer> findAllQAA() {
        return questionAndAnswerRepository.findAll();
    }

    @Override
    public QuestionAndAnswer saveQAA(QuestionAndAnswer QAA) {
        return questionAndAnswerRepository.save(QAA);
    }

    @Override
    public QuestionAndAnswer getByIdQAA(Long id) {
        return questionAndAnswerRepository.getById(id);
    }

    @Override
    public void deleteByIdQAA(Long id) {
        questionAndAnswerRepository.deleteById(id);
    }

    @Override
    public List<QuestionAndAnswer> getQuestionAndAnswersByTest(Test test) {
        return questionAndAnswerRepository.getQuestionAndAnswersByTest(test);
    }

    @Override
    public List<Question> findAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question getByIdQuestion(Long id) {
        return questionRepository.getById(id);
    }

    @Override
    public void deleteByIdQuestion(Long id) {
        questionRepository.deleteById(id);
    }


}
