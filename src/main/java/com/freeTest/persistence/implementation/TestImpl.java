package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Test;
import com.freeTest.persistence.iImpl.ITest;
import com.freeTest.persistence.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@AllArgsConstructor
public class TestImpl implements ITest {
    private TestRepository testRepository;

    @Override
    public Optional<Test> findTestById(Long tId) {return testRepository.findById(tId);}

    @Override
    public Optional<Test> findTestByTestName(String testName) {return Optional.ofNullable(testRepository.findTestByTestName(testName));}

    @Override
    public Optional<Test> findTestByTestSubj(Long subj) {return Optional.ofNullable(testRepository.findTestByTestSubj(subj));}

    @Override
    public Iterable<Test> findAll() {return testRepository.findAll();}

    @Override
    public Test save(Test test) {return testRepository.save(test);}
}
