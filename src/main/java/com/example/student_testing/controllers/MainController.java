package com.example.student_testing.controllers;


import com.example.student_testing.Service.Service;
import com.example.student_testing.models.Student;
import com.example.student_testing.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final Service service;

    public MainController(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }

    @PostMapping("/")
    public String addStudent(@RequestParam String first_name,
                             @RequestParam String last_name,
                             Model model) {
        Student students = service.saveStudent(new Student(first_name + ' ' + last_name));
        return "redirect:/choicetest/"+students.getId();
    }
}
