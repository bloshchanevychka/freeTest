package com.freeTest;

import com.freeTest.persistence.entity.*;
import com.freeTest.persistence.iImpl.IQuestionLevel;
import com.freeTest.persistence.implementation.QuestionTypeImpl;
import com.freeTest.persistence.repository.*;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.Optional;


@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    private static final Logger log= LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init( QuestionAnswerSetRepository questionAnswerSetRepository, QuestionLevelRepository questionLevelRepository, QuestionTypeRepository questionTypeRepository, AnswersStatusRepository answersStatusRepository,SubjectRepository subjectRepository, StatusTableRepository statusTableRepository, QuestionsRepository questionsRepository, AnswersRepository answersRepository){

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
            questionsRepository.save(new Questions("I ___ tired, so I went to bed early yesterday.", questionLevelRepository.findQuestionLevelByQuestionLevel("Easy"), questionTypeRepository.findQuestionTypeByType("One answer question"), "No info"));
            questionsRepository.save(new Questions("I was ___ my car at that time.", questionLevelRepository.findQuestionLevelByQuestionLevel("Medium"), questionTypeRepository.findQuestionTypeByType("One answer question"), "No info"));
            questionsRepository.save(new Questions("How many hours a day do you sleep?", questionLevelRepository.findQuestionLevelByQuestionLevel("Easy"), questionTypeRepository.findQuestionTypeByType("One answer question"), "No info"));
            questionsRepository.save(new Questions("How often do you play tennis?", questionLevelRepository.findQuestionLevelByQuestionLevel("Hard"), questionTypeRepository.findQuestionTypeByType("One answer question"), "No info"));
            answersRepository.save(new Answers("was"));
            answersRepository.save(new Answers("is"));
            answersRepository.save(new Answers("am"));
            answersRepository.save(new Answers("were"));
            answersRepository.save(new Answers("washes"));
            answersRepository.save(new Answers("wash"));
            answersRepository.save(new Answers("washed"));
            answersRepository.save(new Answers("washing"));
            answersStatusRepository.save(new AnswerStatus(true));
            answersStatusRepository.save(new AnswerStatus(false));
  //          questionAnswerSetRepository.save(new QuestionAnswerSet(questionsRepository.findQuestionsByQuestionText("I ___ tired, so I went to bed early yesterday."),answersRepository.findAnswerByAnswer("was") ,answersStatusRepository.findAnswerStatusByAStatus(true)));
  //          questionAnswerSetRepository.save(new QuestionAnswerSet(questionsRepository.findQuestionsByQuestionText("I ___ tired, so I went to bed early yesterday."),answersRepository.findAnswerByAnswer("is") ,answersStatusRepository.findAnswerStatusByAStatus(false)));
//            questionAnswerSetRepository.save(new QuestionAnswerSet(questionsRepository.findQuestionsByQuestionText("I ___ tired, so I went to bed early yesterday."),answersRepository.findAnswerByAnswer("am") ,answersStatusRepository.findAnswerStatusByAStatus(false)));
//            questionAnswerSetRepository.save(new QuestionAnswerSet(questionsRepository.findQuestionsByQuestionText("I ___ tired, so I went to bed early yesterday."),answersRepository.findAnswerByAnswer("were") ,answersStatusRepository.findAnswerStatusByAStatus(false)));
//
//            questionAnswerSetRepository.save(new QuestionAnswerSet(questionsRepository.findQuestionsByQuestionText("I was ___ my car at that time."),answersRepository.findAnswerByAnswer("washes") ,answersStatusRepository.findAnswerStatusByAStatus(false)));
//            questionAnswerSetRepository.save(new QuestionAnswerSet(questionsRepository.findQuestionsByQuestionText("I was ___ my car at that time."),answersRepository.findAnswerByAnswer("washed") ,answersStatusRepository.findAnswerStatusByAStatus(false)));
//            questionAnswerSetRepository.save(new QuestionAnswerSet(questionsRepository.findQuestionsByQuestionText("I was ___ my car at that time."),answersRepository.findAnswerByAnswer("wash") ,answersStatusRepository.findAnswerStatusByAStatus(false)));
//            questionAnswerSetRepository.save(new QuestionAnswerSet(questionsRepository.findQuestionsByQuestionText("I was ___ my car at that time."),answersRepository.findAnswerByAnswer("washing") ,answersStatusRepository.findAnswerStatusByAStatus(true)));

            subjectRepository.save(new Subject("English"));
            subjectRepository.save(new Subject("Programming. Java"));

        };
    }
}
