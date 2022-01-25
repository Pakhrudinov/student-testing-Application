package com.example.student_testing.controllers;

import com.example.student_testing.models.Questions;
import com.example.student_testing.models.QuestionsAndAnswer;
import com.example.student_testing.repo.QuestionsAndAnswerRepository;
import com.example.student_testing.repo.QuestionsRepository;
import com.example.student_testing.repo.TestsRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Controller
public class TestSolutionController {

    private QuestionsAndAnswerRepository questionsAndAnswerRepository;
    private TestsRepository testsRepository;
    private QuestionsRepository questionsRepository;

    public TestSolutionController(QuestionsAndAnswerRepository questionsAndAnswerRepository,
                                  TestsRepository testsRepository,
                                  QuestionsRepository questionsRepository) {
        this.questionsAndAnswerRepository = questionsAndAnswerRepository;
        this.testsRepository = testsRepository;
        this.questionsRepository = questionsRepository;
    }

    @GetMapping("/test_solution/{iduser}/{idtest}")
    public String solution(@PathVariable Long iduser,
                           @PathVariable Long idtest,
                           Model model) {

        List<QuestionsAndAnswer> questionsAndAnswers = questionsAndAnswerRepository.findAll();
        List<QuestionsAndAnswer> questionsAndAnswers1 = new ArrayList<>();

        for (QuestionsAndAnswer el:
             questionsAndAnswers) {
            if (el.getTest_id().equals(idtest.toString())){
                questionsAndAnswers1.add(el);
            }
        }


        model.addAttribute("question" , questionsAndAnswers1);
        model.addAttribute("test", testsRepository.getById(idtest));
        model.addAttribute("questions", questionsRepository.findAll());
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


        List<QuestionsAndAnswer> questionsAndAnswers = questionsAndAnswerRepository.findAll();
        List<String> questionsAndAnswers1 = new ArrayList<>();
        List<String> answers = new ArrayList<>(Arrays.asList(answer1, answer2, answer3, answer4, answer5));



        for (QuestionsAndAnswer el:
                questionsAndAnswers) {
            if (el.getTest_id().equals(idtest.toString())){

                questionsAndAnswers1.add(el.getAnswer());
            }
        }

        int kanswer = 0;
        for (int i=0; i<5; i++){
            if (questionsAndAnswers1.get(i).equals(answers.get(i))){
                kanswer++;
            }
        }

        System.out.println(questionsAndAnswers1);
        System.out.println(answers);
        System.out.println(kanswer);
        return "redirect:/total/" + kanswer;
    }

    @GetMapping("/total/{kanswer}")
    public String totalAnswer(@PathVariable Long kanswer, Model model){

        model.addAttribute("answerk", kanswer);
        return "total";
    }

}
