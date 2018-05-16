package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.Result;
import java.util.Date;
import java.util.Optional;

public interface IResult {

    Optional <Result> findResultById (Long rId);
    Optional <Result> findResultByTestDate (Date dateOfTest);
    Optional <Result> findResultByTestId (Long testId);
    Optional <Result> findResultByUserId (Long userId);
    Optional <Result> findResultByGivenAnswer (Long answerId);
}
