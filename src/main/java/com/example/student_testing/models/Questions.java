package com.example.student_testing.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Questions {

    private @Id
    @GeneratedValue
    Long id;
    private String question;
    private String questions_id;

    public Questions() {
    }


    public Questions(String question, String questions_id) {
        this.question = question;
        this.questions_id = questions_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestions_id() {
        return questions_id;
    }

    public void setQuestions_id(String questions_id) {
        this.questions_id = questions_id;
    }
}


