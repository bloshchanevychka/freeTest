package com.freeTest.persistence.implementation;


import com.freeTest.persistence.entity.QuestionAnswerSet;
import com.freeTest.persistence.iImpl.IQuestionAnswerSet;
import com.freeTest.persistence.repository.QuestionAnswerSetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@AllArgsConstructor
public class QuestionAnswerSetImpl implements IQuestionAnswerSet {

    private QuestionAnswerSetRepository setRepository;

    @Override
    public Optional<QuestionAnswerSet> findQuestionAnswerSetById(Long id) {return setRepository.findById(id);}

    @Override
    public Optional<QuestionAnswerSet> findQuestionAnswerSetByQuestion(Long qId){return Optional.ofNullable(setRepository.findQuestionAnswerSetByQuestion(qId));};

    @Override
    public Optional<QuestionAnswerSet> findQuestionAnswerSetByAnswer(Long aId){return Optional.ofNullable(setRepository.findQuestionAnswerSetByAnswer(aId));};

    @Override
    public Optional<QuestionAnswerSet> findQuestionAnswerSetByStatus(Long sId){return Optional.ofNullable(setRepository.findQuestionAnswerSetByStatus(sId));};

    @Override
    public Iterable<QuestionAnswerSet> findAll() {return setRepository.findAll();}

    @Override
    public QuestionAnswerSet save(QuestionAnswerSet questionAnswerSet) {return setRepository.save(questionAnswerSet);}
}
