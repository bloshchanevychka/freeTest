package com.freeTest.persistence.implementation;


import com.freeTest.persistence.entity.AnswerStatus;
import com.freeTest.persistence.iImpl.IAnswersStatus;
import com.freeTest.persistence.repository.AnswersStatusRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class AnswersStatusImpl implements IAnswersStatus {
    private AnswersStatusRepository aSRepository;

    @Override
    public Optional<AnswerStatus> findAnswerStatusById(Long id) {return aSRepository.findById(id);}

    @Override
    public Optional<AnswerStatus> findAnswerStatusByaStatus(boolean answerSt) {return Optional.ofNullable(aSRepository.findAnswerStatusByAStatus(answerSt));}

    @Override
    public List<AnswerStatus> findAll(){return Lists.newArrayList(aSRepository.findAll());}

    @Override
    public AnswerStatus save(AnswerStatus answerStatus) {return aSRepository.save(answerStatus);}
}
