package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.QuestionType;
import com.freeTest.persistence.iImpl.IQuestionType;
import com.freeTest.persistence.repository.QuestionTypeRepository;

import java.util.Optional;

public class QuestionTypeImpl implements IQuestionType {
    private QuestionTypeRepository questionTypeRepository;

    public QuestionTypeImpl(QuestionTypeRepository questionTypeRepository) {
        this.questionTypeRepository = questionTypeRepository;
    }

     @Override
     public Optional<QuestionType> findQuestionTypeById (Long qId){ return questionTypeRepository.findById(qId);}

    @Override
    public Optional<QuestionType> findQuestionTypeByType (String type) { return Optional.ofNullable(questionTypeRepository.findQuestionTypeByType(type));}
}
