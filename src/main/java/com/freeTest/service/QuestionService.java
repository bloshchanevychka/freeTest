package com.freeTest.service;

import com.freeTest.persistence.entity.*;
import com.freeTest.persistence.iImpl.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public  class QuestionService {

    private IQuestions iQuestions;
    private IAnswers iAnswers;
    private IQuestionType iQuestionType;
    private IQuestionLevel iQuestionLevel;
    private IAnswersStatus iAnswersStatus;
    private IQuestionSettings iQuestionSettings;
    private IQuestionSettingsSet iQuestionSettingsSet;
    private IQuestionAnswerSet iQuestionAnswerSet;

    public List<Questions> findAllQuestions(){
        return iQuestions.findAll();
    }

    public Questions findQuestionById(Long id){
        return iQuestions.findQuestionsById(id).orElseThrow(()->new RuntimeException());
    }

    public Questions findQuestionByQText(String text){
        return iQuestions.findQuestionsByQuestionText(text).orElseThrow(()->new RuntimeException());
    }

    public Answers findAnswer(String text){
        return iAnswers.findAnswerByAnswer(text).orElseThrow(()->new RuntimeException());
    }

    public Questions createQuestion(Questions questions,String qType, String qLevel){
        QuestionType questionType = iQuestionType.findQuestionTypeByType(qType).orElseThrow(()->new RuntimeException());
        QuestionLevel questionLevel = iQuestionLevel.findQuestionLevelByQuestionLevel(qLevel).orElseThrow(()->new RuntimeException());
//        Questions questions = new Questions(qText, questionLevel, questionType, qAddInfo);
        questions.setQuestionType(questionType);
        questions.setqLevel(questionLevel);
        questions = iQuestions.save(questions);
        return questions;
    }

    public Answers createAnswer(String answer){
        Answers answers = new Answers(answer);
        answers = iAnswers.save(answers);
        return answers;
    }

    public QuestionType createQType(String typeName){
        QuestionType questionType = new QuestionType(typeName);
        questionType = iQuestionType.save(questionType);
        return questionType;
    }

    public QuestionLevel createQLevel(String levelName){
        QuestionLevel questionLevel = new QuestionLevel(levelName);
        questionLevel = iQuestionLevel.save(questionLevel);
        return questionLevel;
    }

    public QuestionSettings createSettings(Integer answAmount, String help, String picture){
        QuestionSettings questionSettings = new QuestionSettings(answAmount, help, picture);
        questionSettings = iQuestionSettings.save(questionSettings);
        return questionSettings;
    }

    public QuestionAnswerSet addAnswersToQuestion(String question, String answer, boolean status) {
        Questions questions = findQuestionByQText(question);
        Answers answers = findAnswer(answer);
        AnswerStatus answerStatus = iAnswersStatus.findAnswerStatusByaStatus(status).orElseThrow(()-> new RuntimeException());
        QuestionAnswerSet questionAnswerSet = new QuestionAnswerSet(questions, answers, answerStatus);
        questionAnswerSet = iQuestionAnswerSet.save(questionAnswerSet);
        return questionAnswerSet;
    }

    public QuestionSettingSet AddSettingsForQuestion (String question, Integer setting){
        Questions questionsQ = iQuestions.findQuestionsByQuestionText(question).orElseThrow(()->new RuntimeException());
        QuestionSettings questionSettings = iQuestionSettings.findQuestionSettingsByAnswAmount(setting).orElseThrow(()->new RuntimeException());
        QuestionSettingSet questionSettingSet = new QuestionSettingSet(questionsQ, questionSettings);
        questionSettingSet = iQuestionSettingsSet.save(questionSettingSet);
        return questionSettingSet;
    }


    // ask a question
    public QuestionAnswerSet selectByType (String questionType){
            Questions question = iQuestions.findQuestionsByQuestionType(iQuestionType.findQuestionTypeByType(questionType).orElseThrow(()-> new RuntimeException()).getTypeId()).orElseThrow(()-> new RuntimeException());
            QuestionAnswerSet questionAnswerSet = iQuestionAnswerSet.findQuestionAnswerSetByQuestion(question.getQuestionId()).orElseThrow(()-> new RuntimeException());
            return questionAnswerSet;
    }

}
