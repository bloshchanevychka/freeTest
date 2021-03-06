package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.Test;

import java.util.List;
import java.util.Optional;

public interface ITest {
    Optional<Test> findTestById (Long tId);
    Optional<Test> findTestByTestName (String testName);
    Optional<Test> findTestByTestSubj (Long subj);
    List<Test> findAll();
    Test save(Test test);
}
