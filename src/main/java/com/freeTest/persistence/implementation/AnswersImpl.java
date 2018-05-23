package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Answers;
import com.freeTest.persistence.iImpl.IAnswers;
import com.freeTest.persistence.repository.AnswersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@AllArgsConstructor
public class AnswersImpl implements IAnswers {
    private AnswersRepository aRepository;

    @Override
    public Optional<Answers> findAnswersById(Long id) {return aRepository.findById(id);}

    @Override
    public Optional<Answers> findAnswerByAnswer(String answer) {return Optional.ofNullable(aRepository.findAnswerByAnswer(answer));}

    @Override
    public Iterable<Answers> findAll(){return aRepository.findAll();}

    @Override
    public Answers save (Answers answer) {return aRepository.save(answer);}

}
