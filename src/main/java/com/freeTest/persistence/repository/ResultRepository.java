package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.Result;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface ResultRepository extends CrudRepository <Result, Long> {
    Result findResultByQuestionId (Long qId);
    Result findResultByTestDate (Date dateOfTest);
    Result findResultByTestId (Long testId);
    Result findResultByUserId (Long userId);
    Result findResultByGivenAnswer (Long answerId);
}
