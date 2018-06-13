package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Answers;
import com.freeTest.persistence.iImpl.IAnswers;
import com.freeTest.persistence.repository.AnswersRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.List;
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
    public List<Answers> findAll(){return Lists.newArrayList(aRepository.findAll());}

    @Override
    public Answers save (Answers answer) {return aRepository.save(answer);}

}
