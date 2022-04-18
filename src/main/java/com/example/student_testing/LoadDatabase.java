package com.example.student_testing;/*
package com.example.student_testing;

import com.example.student_testing.Service.Service;
import com.example.student_testing.models.Question;
import com.example.student_testing.models.QuestionAndAnswer;
import com.example.student_testing.models.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(Service service) {
        return args -> {
            Test test1 = service.saveTest(new Test("Первый тест"));
            Test test2 = service.saveTest(new Test("Второй тест"));


            service.findAllTest().forEach(tests -> log.info("Preloaded" + tests));

            QuestionAndAnswer QAA1 = service.saveQAA(new QuestionAndAnswer("Первый вопрос", "Первый вариант ответа", test1));
            QuestionAndAnswer QAA2 = service.saveQAA(new QuestionAndAnswer("Второй вопрос", "Третий вариант ответа", test1));
            QuestionAndAnswer QAA3 = service.saveQAA(new QuestionAndAnswer("Третий вопрос", "Третий вариант ответа", test1));
            QuestionAndAnswer QAA4 = service.saveQAA(new QuestionAndAnswer("Четвертый вопрос", "Третий вариант ответа", test1));
            QuestionAndAnswer QAA5 = service.saveQAA(new QuestionAndAnswer("Пятый вопрос", "Третий вариант ответа", test1));

            QuestionAndAnswer QAA6 = service.saveQAA(new QuestionAndAnswer("Первый вопрос", "Первый вариант ответа", test2));
            QuestionAndAnswer QAA7 = service.saveQAA(new QuestionAndAnswer("Второй вопрос", "Третий вариант ответа", test2));
            QuestionAndAnswer QAA8 = service.saveQAA(new QuestionAndAnswer("Третий вопрос", "Третий вариант ответа", test2));
            QuestionAndAnswer QAA9 = service.saveQAA(new QuestionAndAnswer("Четвертый вопрос", "Третий вариант ответа", test2));
            QuestionAndAnswer QAA10 = service.saveQAA(new QuestionAndAnswer("Пятый вопрос", "Третий вариант ответа", test2));


            service.saveQuestion(new Question("Первый вариант ответа", QAA1));
            service.saveQuestion(new Question("Второй вариант ответа", QAA1));
            service.saveQuestion(new Question("Третий вариант ответа", QAA1));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA1));

            service.saveQuestion(new Question("Первый вариант ответа", QAA2));
            service.saveQuestion(new Question("Второй вариант ответа", QAA2));
            service.saveQuestion(new Question("Третий вариант ответа", QAA2));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA2));

            service.saveQuestion(new Question("Первый вариант ответа", QAA3));
            service.saveQuestion(new Question("Второй вариант ответа", QAA3));
            service.saveQuestion(new Question("Третий вариант ответа", QAA3));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA3));

            service.saveQuestion(new Question("Первый вариант ответа", QAA4));
            service.saveQuestion(new Question("Второй вариант ответа", QAA4));
            service.saveQuestion(new Question("Третий вариант ответа", QAA4));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA4));

            service.saveQuestion(new Question("Первый вариант ответа", QAA5));
            service.saveQuestion(new Question("Второй вариант ответа", QAA5));
            service.saveQuestion(new Question("Третий вариант ответа", QAA5));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA5));

            service.saveQuestion(new Question("Первый вариант ответа", QAA6));
            service.saveQuestion(new Question("Второй вариант ответа", QAA6));
            service.saveQuestion(new Question("Третий вариант ответа", QAA6));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA6));

            service.saveQuestion(new Question("Первый вариант ответа", QAA7));
            service.saveQuestion(new Question("Второй вариант ответа", QAA7));
            service.saveQuestion(new Question("Третий вариант ответа", QAA7));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA7));

            service.saveQuestion(new Question("Первый вариант ответа", QAA8));
            service.saveQuestion(new Question("Второй вариант ответа", QAA8));
            service.saveQuestion(new Question("Третий вариант ответа", QAA8));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA8));

            service.saveQuestion(new Question("Первый вариант ответа", QAA9));
            service.saveQuestion(new Question("Второй вариант ответа", QAA9));
            service.saveQuestion(new Question("Третий вариант ответа", QAA9));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA9));

            service.saveQuestion(new Question("Первый вариант ответа", QAA10));
            service.saveQuestion(new Question("Второй вариант ответа", QAA10));
            service.saveQuestion(new Question("Третий вариант ответа", QAA10));
            service.saveQuestion(new Question("Четвертый вариант ответа", QAA10));

        };
    }
}
*/
