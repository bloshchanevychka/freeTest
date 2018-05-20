package com.freeTest;

import com.freeTest.persistence.entity.QuestionLevel;
import com.freeTest.persistence.entity.QuestionType;
import com.freeTest.persistence.repository.QuestionLevelRepository;
import com.freeTest.persistence.repository.QuestionTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    private static final Logger log= LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    CommandLineRunner init(QuestionLevelRepository questionLevelRepository, QuestionTypeRepository questionTypeRepository){
        return (args) -> {
            questionLevelRepository.save(new QuestionLevel("Easy"));
            questionLevelRepository.save(new QuestionLevel("Medium"));
            questionLevelRepository.save(new QuestionLevel("Hard"));
            questionTypeRepository.save(new QuestionType("One answer question"));
            questionTypeRepository.save(new QuestionType("More than one answer question"));
        };
    }
}
