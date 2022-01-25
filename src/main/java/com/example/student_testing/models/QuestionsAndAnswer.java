package com.example.student_testing.models;

import javax.persistence.*;

@Entity
@Table(name = "QUESTIONS_AND_ANSWER")
public class QuestionsAndAnswer {
    private @Id
    @GeneratedValue
    Long id;
    private String question_Name;
    private String answer;

    private String test_id;

    public QuestionsAndAnswer() {
    }

    public QuestionsAndAnswer(String question_Name, String answer, String test_id) {
        this.question_Name = question_Name;
        this.answer = answer;
        this.test_id = test_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion_Name() {
        return question_Name;
    }

    public void setQuestion_Name(String question_Name) {
        this.question_Name = question_Name;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getTest_id() {
        return test_id;
    }

    public void setTest(String test_id) {
        this.test_id = test_id;
    }
}
