package com.example.student_testing;

import com.example.student_testing.models.Questions;
import com.example.student_testing.models.QuestionsAndAnswer;
import com.example.student_testing.models.Tests;
import com.example.student_testing.repo.QuestionsAndAnswerRepository;
import com.example.student_testing.repo.QuestionsRepository;
import com.example.student_testing.repo.TestsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TestsRepository testsRepository,
                                   QuestionsAndAnswerRepository questionsAndAnswerRepository,
                                   QuestionsRepository questionsRepository) {
        return args -> {
            testsRepository.save(new Tests("Первый тест"));
            testsRepository.save(new Tests("Второй тест"));


            testsRepository.findAll().forEach(tests -> log.info("Preloaded" + tests));

            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Первый вопрос", "Первый вариант ответа", "1"));
            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Второй вопрос", "Третий вариант ответа", "1"));
            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Третий вопрос", "Третий вариант ответа", "1"));
            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Четвертый вопрос", "Третий вариант ответа", "1"));
            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Пятый вопрос", "Третий вариант ответа", "1"));

            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Первый вопрос", "Первый вариант ответа", "2"));
            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Второй вопрос", "Третий вариант ответа", "2"));
            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Третий вопрос", "Третий вариант ответа", "2"));
            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Четвертый вопрос", "Третий вариант ответа", "2"));
            questionsAndAnswerRepository.save(new QuestionsAndAnswer("Пятый вопрос", "Третий вариант ответа", "2"));

            questionsRepository.save(new Questions("Первый вариант ответа", "3"));
            questionsRepository.save(new Questions("Второй вариант ответа", "3"));
            questionsRepository.save(new Questions("Третий вариант ответа", "3"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "3"));

            questionsRepository.save(new Questions("Первый вариант ответа", "4"));
            questionsRepository.save(new Questions("Второй вариант ответа", "4"));
            questionsRepository.save(new Questions("Третий вариант ответа", "4"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "4"));

            questionsRepository.save(new Questions("Первый вариант ответа", "5"));
            questionsRepository.save(new Questions("Второй вариант ответа", "5"));
            questionsRepository.save(new Questions("Третий вариант ответа", "5"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "5"));

            questionsRepository.save(new Questions("Первый вариант ответа", "6"));
            questionsRepository.save(new Questions("Второй вариант ответа", "6"));
            questionsRepository.save(new Questions("Третий вариант ответа", "6"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "6"));

            questionsRepository.save(new Questions("Первый вариант ответа", "7"));
            questionsRepository.save(new Questions("Второй вариант ответа", "7"));
            questionsRepository.save(new Questions("Третий вариант ответа", "7"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "7"));

            questionsRepository.save(new Questions("Первый вариант ответа", "8"));
            questionsRepository.save(new Questions("Второй вариант ответа", "8"));
            questionsRepository.save(new Questions("Третий вариант ответа", "8"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "8"));

            questionsRepository.save(new Questions("Первый вариант ответа", "9"));
            questionsRepository.save(new Questions("Второй вариант ответа", "9"));
            questionsRepository.save(new Questions("Третий вариант ответа", "9"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "9"));

            questionsRepository.save(new Questions("Первый вариант ответа", "10"));
            questionsRepository.save(new Questions("Второй вариант ответа", "10"));
            questionsRepository.save(new Questions("Третий вариант ответа", "10"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "10"));

            questionsRepository.save(new Questions("Первый вариант ответа", "11"));
            questionsRepository.save(new Questions("Второй вариант ответа", "11"));
            questionsRepository.save(new Questions("Третий вариант ответа", "11"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "11"));

            questionsRepository.save(new Questions("Первый вариант ответа", "12"));
            questionsRepository.save(new Questions("Второй вариант ответа", "12"));
            questionsRepository.save(new Questions("Третий вариант ответа", "12"));
            questionsRepository.save(new Questions("Четвертый вариант ответа", "12"));

        };
    }
}
