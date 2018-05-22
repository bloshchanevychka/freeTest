package com.freeTest.service;

import com.freeTest.persistence.entity.QuestionType;
import com.freeTest.persistence.entity.Questions;
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
    private IQuestionType iQuestionType;

//    public Questions findQuestionById(Long i d){
//        return iQuestions.findQuestionsById(id).orElseThrow(()->new RuntimeException());
//    }
//
//    public Questions create(QuestionDTO dto){
//        QuestionType questionType = iQuestionType.findQuestionTypeByType("gfdgfdg").orElseThrow(()->new RuntimeException());
//        Questions questions = dto.convertor();
//        questions.setQuestionType(questionType);
//        questions = iQuestions.save(questions);
//        return questions;
//    }


}
