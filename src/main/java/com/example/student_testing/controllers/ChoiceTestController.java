package com.example.student_testing.controllers;

import com.example.student_testing.Service.Service;
import com.example.student_testing.models.Student;
import com.example.student_testing.models.Test;
import com.example.student_testing.repo.StudentRepository;
import com.example.student_testing.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChoiceTestController {
    private final Service service;

    public ChoiceTestController(Service service) {
        this.service = service;
    }

    @GetMapping("choicetest/{id}")
    public String choiceTest(@PathVariable Long id, Model model) {
        Iterable<Test> tests = service.findAllTest();
        model.addAttribute("tests", tests);
        return "choice_of_test";
    }

    @PostMapping("/choicetest/{id}")
    public String throwOverTest(@PathVariable Long id, @RequestParam Long test_id, Model model) {
        Student students = service.getByIdStudent(id);
        students.setTest(service.getByIdTest(test_id));
        service.saveStudent(students);
        return "redirect:/test_solution/" + id + "/" + test_id;
    }
}
