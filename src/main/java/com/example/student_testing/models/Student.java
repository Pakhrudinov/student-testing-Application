package com.example.student_testing.models;

import javax.persistence.*;

@Entity
public class Student {
    private @Id
    @GeneratedValue
    Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "TEST_ID")
    private Test test;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", test=" + test +
                '}';
    }
}
