package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.QuestionType;
import com.freeTest.persistence.iImpl.IQuestionType;
import com.freeTest.persistence.repository.QuestionTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@AllArgsConstructor
public class QuestionTypeImpl implements IQuestionType {
    private QuestionTypeRepository questionTypeRepository;

     @Override
     public Optional<QuestionType> findQuestionTypeById(Long qId){return questionTypeRepository.findById(qId);}

    @Override
    public Optional<QuestionType> findQuestionTypeByType(String type) {return Optional.ofNullable(questionTypeRepository.findQuestionTypeByType(type));}

    @Override
    public Iterable<QuestionType> findAll() {return questionTypeRepository.findAll();}

    @Override
    public QuestionType save(QuestionType  questionType) {return questionTypeRepository.save(questionType);}
}
