package com.example.student_testing.controllers;

import com.example.student_testing.models.Students;
import com.example.student_testing.models.Tests;
import com.example.student_testing.repo.StudentsRepository;
import com.example.student_testing.repo.TestsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChoiceTestController {
    private TestsRepository testsRepository;
    private StudentsRepository studentsRepository;

    public ChoiceTestController(TestsRepository testsRepository, StudentsRepository studentsRepository) {
        this.testsRepository = testsRepository;
        this.studentsRepository = studentsRepository;
    }

    @GetMapping("choicetest/{id}")
    public String choiceTest(@PathVariable Long id, Model model) {
        Iterable<Tests> tests = testsRepository.findAll();
        model.addAttribute("tests", tests);
        return "choice_of_test";
    }

    @PostMapping("/choicetest/{id}")
    public String throwOverTest(@PathVariable Long id, @RequestParam Long test_id, Model model) {

        Students students = studentsRepository.findById(id).orElseThrow();
        students.setTest_id(test_id.toString());
        studentsRepository.save(students);
        return "redirect:/test_solution/" + id + "/" + test_id;
    }
}
