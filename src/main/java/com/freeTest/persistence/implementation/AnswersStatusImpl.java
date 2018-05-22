package com.freeTest.persistence.implementation;


import com.freeTest.persistence.entity.AnswerStatus;
import com.freeTest.persistence.iImpl.IAnswersStatus;
import com.freeTest.persistence.repository.AnswersStatusRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class AnswersStatusImpl implements IAnswersStatus {
    private AnswersStatusRepository aSRepository;

    public AnswersStatusImpl(AnswersStatusRepository aRepository) {
        this.aSRepository = aSRepository;
    }

    @Override
    public Optional<AnswerStatus> findAnswerStatusById(Long id) {
        return aSRepository.findById(id);
    }

    @Override
    public Optional<AnswerStatus> findAnswerStatusByaStatus(boolean answerSt) {
        return Optional.ofNullable(aSRepository.findAnswerStatusByAStatus(answerSt));
    }
}
