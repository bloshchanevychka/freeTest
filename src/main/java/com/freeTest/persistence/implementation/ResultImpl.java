package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Result;
import com.freeTest.persistence.iImpl.IResult;
import com.freeTest.persistence.repository.ResultRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class ResultImpl implements IResult {
    private ResultRepository resultRepository;

    @Override
    public Optional<Result> findResultById(Long rId) {return resultRepository.findById(rId);}

    @Override
    public  Optional <Result> findResultByTestDate(Date dateOfTest) {return Optional.ofNullable(resultRepository.findResultByTestDate(dateOfTest));}

    @Override
    public Optional <Result> findResultByTestId(Long testId) {return Optional.ofNullable(resultRepository.findResultByTestId(testId));}

    @Override
    public Optional <Result> findResultByUserId(Long userId) {return Optional.ofNullable(resultRepository.findResultByUserId(userId));}

    @Override
    public Optional <Result> findResultByGivenAnswer(Long answerId) {return Optional.ofNullable(resultRepository.findResultByGivenAnswer(answerId));}

    @Override
    public Iterable<Result> findAll() {return resultRepository.findAll();}

    @Override
    public Result save(Result result) {return resultRepository.save(result);}
}
