package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Questions;
import com.freeTest.persistence.iImpl.IQuestions;
import com.freeTest.persistence.repository.QuestionsRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class QuestionsImpl implements IQuestions {

    private QuestionsRepository qRepository;

    @Override
    public Optional<Questions> findQuestionsById(Long questionId) {return qRepository.findById(questionId);}

    @Override
    public Optional<Questions> findQuestionsByQuestionType(Long type) {return Optional.ofNullable(qRepository.findQuestionsByQuestionType(type));}

    @Override
    public Optional<Questions> findQuestionsByQLevel(Long level){return Optional.ofNullable(qRepository.findQuestionsByQLevel(level));}

    @Override
    public Optional<Questions> findQuestionsByQuestionText(String text) {return Optional.ofNullable(qRepository.findQuestionsByQuestionText(text));}

    @Override
    public List<Questions> findAll() {return Lists.newArrayList(qRepository.findAll());}

    @Override
    public Questions save(Questions questions){return qRepository.save(questions);}
}
