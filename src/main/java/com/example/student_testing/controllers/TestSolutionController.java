package com.example.student_testing.controllers;

import com.example.student_testing.Service.Service;
import com.example.student_testing.models.QuestionAndAnswer;
import com.example.student_testing.repo.QuestionAndAnswerRepository;
import com.example.student_testing.repo.QuestionRepository;
import com.example.student_testing.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TestSolutionController {
    private final Service service;

    public TestSolutionController(Service service) {
        this.service = service;
    }

    @GetMapping("/test_solution/{iduser}/{idtest}")
    public String solution(@PathVariable Long iduser,
                           @PathVariable Long idtest,
                           Model model) {

        List<QuestionAndAnswer> questionsAndAnswers = service.getQuestionAndAnswersByTest(service.getByIdTest(idtest));

        model.addAttribute("question" , questionsAndAnswers);
        model.addAttribute("test", service.getByIdTest(idtest));
        model.addAttribute("questions", service.findAllQuestion());
        return "test_solution";
    }

    @PostMapping("/test_solution/{iduser}/{idtest}")
    public String iterTest(@PathVariable Long iduser,
                           @PathVariable Long idtest,
                           @RequestParam String answer1,
                           @RequestParam String answer2,
                           @RequestParam String answer3,
                           @RequestParam String answer4,
                           @RequestParam String answer5,
                           Model model){


        List<QuestionAndAnswer> questionsAndAnswers = service.getQuestionAndAnswersByTest(service.getByIdTest(idtest));
        List<String> answers = new ArrayList<>(Arrays.asList(answer1, answer2, answer3, answer4, answer5));


        int kanswer = 0;
        for (int i=0; i<5; i++){
            if (questionsAndAnswers.get(i).getAnswer().equals(answers.get(i))){
                kanswer++;
            }
        }

        return "redirect:/total/" + kanswer;
    }

    @GetMapping("/total/{kanswer}")
    public String totalAnswer(@PathVariable Long kanswer, Model model){

        model.addAttribute("answerk", kanswer);
        return "total";
    }

}
