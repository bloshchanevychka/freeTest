package com.freeTest.persistence.implementation;


import com.freeTest.persistence.entity.QuestionAnswerSet;
import com.freeTest.persistence.iImpl.IQuestionAnswerSet;
import com.freeTest.persistence.repository.QuestionAnswerSetRepository;
import java.util.Optional;

public class QuestionAnswerSetImpl implements IQuestionAnswerSet {

    private QuestionAnswerSetRepository setRepository;

    public QuestionAnswerSetImpl(QuestionAnswerSetRepository setRepository) {
        this.setRepository = setRepository;
    }
    @Override
    public Optional<QuestionAnswerSet> findQuestionAnswerSetById(Long id) {
        return setRepository.findById(id);
    }
    ////////////////////////////////////////////////////
    @Override
    public Optional<QuestionAnswerSet> findQuestionAnswerSetByQuestion(Long qId){return Optional.ofNullable(setRepository.findQuestionAnswerSetByQuestion(qId));};
    public Optional<QuestionAnswerSet> findQuestionAnswerSetByAnswer(Long aId){return Optional.ofNullable(setRepository.findQuestionAnswerSetByAnswer(aId));};
    public Optional<QuestionAnswerSet> findQuestionAnswerSetByStatus(Long sId){ return Optional.ofNullable(setRepository.findQuestionAnswerSetByStatus(sId));};
}
