package com.freeTest;

import com.freeTest.persistence.entity.AnswerStatus;
import com.freeTest.persistence.entity.QuestionLevel;
import com.freeTest.persistence.entity.QuestionType;
import com.freeTest.persistence.entity.StatusTable;
import com.freeTest.persistence.repository.AnswersStatusRepository;
import com.freeTest.persistence.repository.QuestionLevelRepository;
import com.freeTest.persistence.repository.QuestionTypeRepository;
import com.freeTest.persistence.repository.StatusTableRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;


@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    private static final Logger log= LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(QuestionLevelRepository questionLevelRepository, QuestionTypeRepository questionTypeRepository, AnswersStatusRepository answersStatusRepository, StatusTableRepository statusTableRepository){
        return (args) -> {
            questionLevelRepository.save(new QuestionLevel("Easy"));
            questionLevelRepository.save(new QuestionLevel("Medium"));
            questionLevelRepository.save(new QuestionLevel("Hard"));
            questionTypeRepository.save(new QuestionType("One answer question"));
            questionTypeRepository.save(new QuestionType("More than one answer question"));
            questionTypeRepository.save(new QuestionType("conformity question"));
            questionTypeRepository.save(new QuestionType("true/false question"));
            answersStatusRepository.save(new AnswerStatus(true));
            answersStatusRepository.save(new AnswerStatus(false));
            statusTableRepository.save(new StatusTable(0));
            statusTableRepository.save(new StatusTable(1));
            statusTableRepository.save(new StatusTable(2));
        };
    }
}
