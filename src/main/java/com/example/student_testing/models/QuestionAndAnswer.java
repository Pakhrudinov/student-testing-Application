package com.example.student_testing.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "QUESTION_AND_ANSWER")
public class QuestionAndAnswer {
    private @Id
    @GeneratedValue
    Long id;
    private String question_Name;
    private String answer;

    @ManyToOne
    @JoinColumn(name = "TEST_ID")
    private Test test;

    public QuestionAndAnswer() {
    }

    public QuestionAndAnswer(String question_Name, String answer, Test test) {
        this.question_Name = question_Name;
        this.answer = answer;
        this.test = test;
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

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "QuestionAndAnswer{" +
                "id=" + id +
                ", question_Name='" + question_Name + '\'' +
                ", answer='" + answer + '\'' +
                ", test=" + test +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof QuestionAndAnswer)) return false;
        QuestionAndAnswer that = (QuestionAndAnswer) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getQuestion_Name(), that.getQuestion_Name()) && Objects.equals(getAnswer(), that.getAnswer()) && Objects.equals(getTest(), that.getTest());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuestion_Name(), getAnswer(), getTest());
    }
}
