package com.example.student_testing.models;

import javax.persistence.*;

@Entity
public class Question {

    private @Id
    @GeneratedValue
    Long id;
    private String question;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID")
    private QuestionAndAnswer questions;

    public Question() {
    }

    public Question(String question, QuestionAndAnswer questions) {
        this.question = question;
        this.questions = questions;
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

    public QuestionAndAnswer getQuestions() {
        return questions;
    }

    public void setQuestions(QuestionAndAnswer questions) {
        this.questions = questions;
    }
}


