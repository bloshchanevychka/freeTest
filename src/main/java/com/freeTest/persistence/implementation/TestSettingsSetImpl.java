package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.TestSettingsSet;
import com.freeTest.persistence.iImpl.ITestSettingsSet;
import com.freeTest.persistence.repository.TestSettingsSetRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class TestSettingsSetImpl implements ITestSettingsSet {
    private TestSettingsSetRepository testSettingsSetRepository;

    public TestSettingsSetImpl(TestSettingsSetRepository testSettingsSetRepository) {
        this.testSettingsSetRepository = testSettingsSetRepository;
    }

    @Override
    public Optional<TestSettingsSet> findTestSettingsSetById(Long tssId) {return testSettingsSetRepository.findById(tssId);}

    @Override
    public Optional<TestSettingsSet> findTestSettingsSetByTest(Long test) {return Optional.ofNullable(testSettingsSetRepository.findTestSettingsSetByTest(test));}

    @Override
    public Optional<TestSettingsSet> findTestSettingsSetBySettingSet(Long setting) {return Optional.ofNullable(testSettingsSetRepository.findTestSettingsSetBySettingSet(setting));}

    @Override
    public Iterable<TestSettingsSet> findAll() {return testSettingsSetRepository.findAll();}
}
