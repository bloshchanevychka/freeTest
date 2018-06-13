package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.QuestionLevel;
import com.freeTest.persistence.iImpl.IQuestionLevel;
import com.freeTest.persistence.repository.QuestionLevelRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class QuestionLevelImpl implements IQuestionLevel {
    private QuestionLevelRepository qlRepository;

    @Override
    public Optional<QuestionLevel> findQuestionLevelById(Long id) {return qlRepository.findById(id);}

    @Override
    public Optional<QuestionLevel> findQuestionLevelByQuestionLevel(String qLevel){return Optional.ofNullable(qlRepository.findQuestionLevelByQuestionLevel(qLevel));};

    @Override
    public List<QuestionLevel> findAll() {return Lists.newArrayList(qlRepository.findAll());}

    @Override
    public QuestionLevel save(QuestionLevel questionLevel) {return qlRepository.save(questionLevel);}

}
