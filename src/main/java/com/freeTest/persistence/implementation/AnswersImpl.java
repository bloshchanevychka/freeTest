package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Answers;
import com.freeTest.persistence.iImpl.IAnswers;
import com.freeTest.persistence.repository.AnswersRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class AnswersImpl implements IAnswers {
    private AnswersRepository aRepository;

    public AnswersImpl(AnswersRepository aRepository) {
        this.aRepository = aRepository;
    }
    @Override
    public Optional<Answers> findAnswersById(Long id) {
        return aRepository.findById(id);
    }

    @Override
    public Optional<Answers> findAnswersByAnswer(String answer) {
        return Optional.ofNullable(aRepository.findAnswersByAnswer(answer));
    }


}
