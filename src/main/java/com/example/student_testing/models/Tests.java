package com.example.student_testing.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tests {
    private @Id
    @GeneratedValue
    Long id;
    private String test_name;

    public Tests() {
    }

    public Tests(String test_name) {

        this.test_name = test_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tests)) return false;
        Tests tests = (Tests) o;
        return Objects.equals(getId(), tests.getId()) && Objects.equals(getTest_name(), tests.getTest_name());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTest_name());
    }

    @Override
    public String toString() {
        return "Tests{" +
                "id=" + id +
                ", test_name='" + test_name + '\'' +
                '}';
    }
}
