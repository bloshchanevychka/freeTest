package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.QuestionLevel;
import com.freeTest.persistence.iImpl.IQuestionLevel;
import com.freeTest.persistence.repository.QuestionLevelRepository;

import java.util.Optional;

public class QuestionLevelImpl implements IQuestionLevel {
    private QuestionLevelRepository qlRepository;

    public QuestionLevelImpl(QuestionLevelRepository setRepository) {
        this.qlRepository = qlRepository;
    }

    @Override
    public Optional<QuestionLevel> findQuestionLevelById(Long id) {
        return qlRepository.findById(id);
    }

    @Override
    public Optional<QuestionLevel> findQuestionLevelByQuestionLevel(String qLevel){return Optional.ofNullable(qlRepository.findQuestionLevelByQuestionLevel(qLevel));};

}
