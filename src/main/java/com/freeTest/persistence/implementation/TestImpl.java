package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Test;
import com.freeTest.persistence.iImpl.ITest;
import com.freeTest.persistence.repository.TestRepository;
import java.util.Optional;

public class TestImpl implements ITest {
    private TestRepository testRepository;

    public TestImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Optional<Test> findTestById (Long tId) {return testRepository.findById(tId);}

    @Override
    public Optional<Test> findTestByTestName (String testName) {return Optional.ofNullable(testRepository.findTestByTestName(testName));}

    @Override
    public Optional<Test> findTestByTestSubj (Long subj) {return Optional.ofNullable(testRepository.findTestByTestSubj(subj));}
}
