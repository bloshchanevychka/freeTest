package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.TestSets;
import com.freeTest.persistence.iImpl.ITestSets;
import com.freeTest.persistence.repository.TestSetsRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class TestSetsImpl implements ITestSets {
    private TestSetsRepository testSetsRepository;

    public TestSetsImpl(TestSetsRepository testSetsRepository) {
        this.testSetsRepository = testSetsRepository;
    }

    @Override
    public Optional<TestSets> findTestSetsByid(Long tsId) {return testSetsRepository.findById(tsId);}

    @Override
    public Optional<TestSets> findTestSetsByQuestionId(Long question) {return Optional.ofNullable(testSetsRepository.findTestSetsByQuestionId(question));}

    @Override
    public Optional<TestSets> findTestSetsByTestId(Long test) {return Optional.ofNullable(testSetsRepository.findTestSetsByTestId(test));}

    @Override
    public Iterable<TestSets> findAll() {return testSetsRepository.findAll();}
}
