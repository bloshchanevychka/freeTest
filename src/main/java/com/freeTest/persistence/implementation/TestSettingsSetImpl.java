package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.TestSettingsSet;
import com.freeTest.persistence.iImpl.ITestSettingsSet;
import com.freeTest.persistence.repository.TestSettingsSetRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class TestSettingsSetImpl implements ITestSettingsSet {
    private TestSettingsSetRepository testSettingsSetRepository;

    @Override
    public Optional<TestSettingsSet> findTestSettingsSetById(Long tssId) {return testSettingsSetRepository.findById(tssId);}

    @Override
    public Optional<TestSettingsSet> findTestSettingsSetByTest(Long test) {return Optional.ofNullable(testSettingsSetRepository.findTestSettingsSetByTest(test));}

    @Override
    public Optional<TestSettingsSet> findTestSettingsSetBySettingSet(Long setting) {return Optional.ofNullable(testSettingsSetRepository.findTestSettingsSetBySettingSet(setting));}

    @Override
    public List<TestSettingsSet> findAll() {return Lists.newArrayList(testSettingsSetRepository.findAll());}

    @Override
    public TestSettingsSet save(TestSettingsSet testSettingsSet) {return testSettingsSetRepository.save(testSettingsSet);}
}
