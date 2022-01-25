package com.example.student_testing.controllers;


import com.example.student_testing.models.Students;
import com.example.student_testing.repo.StudentsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private StudentsRepository studentsRepository;

    public MainController(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }

    @PostMapping("/")
    public String addStudent(@RequestParam String first_name,
                             @RequestParam String last_name,
                             Model model) {
        Students students = studentsRepository.save(new Students(first_name + ' ' + last_name));
        return "redirect:/choicetest/"+students.getId();
    }
}
