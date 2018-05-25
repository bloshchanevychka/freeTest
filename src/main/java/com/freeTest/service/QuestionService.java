package com.freeTest.service;

import com.freeTest.persistence.entity.*;
import com.freeTest.persistence.iImpl.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class QuestionService {

    private IQuestions iQuestions;
    private IAnswers iAnswers;
    private IQuestionType iQuestionType;
    private IQuestionLevel iQuestionLevel;
    private IAnswersStatus iAnswersStatus;
    private IQuestionSettings iQuestionSettings;
    private IQuestionSettingsSet iQuestionSettingsSet;
    private IQuestionAnswerSet iQuestionAnswerSet;

    public Questions findQuestionById(Long id){
        return iQuestions.findQuestionsById(id).orElseThrow(()->new RuntimeException());
    }

    public Questions createQuestion(String qText, String qAddInfo, String qType, String qLevel){
        QuestionType questionType = iQuestionType.findQuestionTypeByType(qType).orElseThrow(()->new RuntimeException());
        QuestionLevel questionLevel = iQuestionLevel.findQuestionLevelByQuestionLevel(qLevel).orElseThrow(()->new RuntimeException());
        Questions questions = new Questions(qText, questionLevel, questionType, qAddInfo);
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

    public QuestionSettings createSettings(Integer answAmount, String help, String picture){
        QuestionSettings questionSettings = new QuestionSettings(answAmount, help, picture);
        questionSettings = iQuestionSettings.save(questionSettings);
        return questionSettings;
    }

    public QuestionAnswerSet addAnswersToQuestion(String question, String answer, boolean status) {
        Questions questions = iQuestions.findQuestionsByQuestionText(question).orElseThrow(()-> new RuntimeException());
        Answers answers = iAnswers.findAnswerByAnswer(answer).orElseThrow(()-> new RuntimeException());
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

}
