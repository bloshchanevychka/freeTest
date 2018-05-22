package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.TestSets;
import java.util.Optional;

public interface ITestSets {
    Optional<TestSets> findTestSetsByid (Long tsId);
    Optional<TestSets> findTestSetsByQuestionId (Long question);
    Optional<TestSets> findTestSetsByTestId (Long test);
    Optional<TestSets> findAll();
}
