package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.TestSets;
import com.freeTest.persistence.iImpl.ITestSets;
import com.freeTest.persistence.repository.TestSetsRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class TestSetsImpl implements ITestSets {
    private TestSetsRepository testSetsRepository;

    @Override
    public Optional<TestSets> findTestSetsByid(Long tsId) {return testSetsRepository.findById(tsId);}

    @Override
    public Optional<TestSets> findTestSetsByQuestionId(Long question) {return Optional.ofNullable(testSetsRepository.findTestSetsByQuestionId(question));}

    @Override
    public Optional<TestSets> findTestSetsByTestId(Long test) {return Optional.ofNullable(testSetsRepository.findTestSetsByTestId(test));}

    @Override
    public List<TestSets> findAll() {return Lists.newArrayList(testSetsRepository.findAll());}

    @Override
    public TestSets save(TestSets testSets) {return testSetsRepository.save(testSets);}
}
