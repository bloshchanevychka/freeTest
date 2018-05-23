package com.freeTest.service;

import com.freeTest.persistence.entity.Answers;
import com.freeTest.persistence.entity.QuestionLevel;
import com.freeTest.persistence.entity.QuestionType;
import com.freeTest.persistence.entity.Questions;
import com.freeTest.persistence.iImpl.IAnswers;
import com.freeTest.persistence.iImpl.IQuestionLevel;
import com.freeTest.persistence.iImpl.IQuestionType;
import com.freeTest.persistence.iImpl.IQuestions;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class QuestionService {

    private IQuestions iQuestions;
    private IAnswers iAnswers;
    private IQuestionType iQuestionType;
    private IQuestionLevel iQuestionLevel;

    public Questions findQuestionById(Long id){
        return iQuestions.findQuestionsById(id).orElseThrow(()->new RuntimeException());
    }

    public Questions create(String qText, String qAddInfo, String qType, String qLevel){
        QuestionType questionType = iQuestionType.findQuestionTypeByType(qType).orElseThrow(()->new RuntimeException());
        QuestionLevel questionLevel = iQuestionLevel.findQuestionLevelByQuestionLevel(qLevel).orElseThrow(()->new RuntimeException());
        Questions questions = new Questions(qText, questionLevel, questionType, qAddInfo);
        questions.setQuestionType(questionType);
        questions.setqLevel(questionLevel);
        //questions = iQuestions.save(questions); --- не работает
        return questions;
    }

    public Answers create(String answer){
        Answers answers = new Answers(answer);
        answers = iAnswers.save(answers);
        return answers;
    }

}
