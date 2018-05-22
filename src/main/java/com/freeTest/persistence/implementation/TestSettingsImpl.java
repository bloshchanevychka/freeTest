package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.TestSettings;
import com.freeTest.persistence.iImpl.ITestSettings;
import com.freeTest.persistence.repository.TestSettingsRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class TestSettingsImpl implements ITestSettings {
    private TestSettingsRepository testSettingsRepository;

    public TestSettingsImpl(TestSettingsRepository testSettingsRepository) {
        this.testSettingsRepository = testSettingsRepository;
    }

    @Override
    public Optional<TestSettings> findTestSettingsById (Long tSetId) {return testSettingsRepository.findById(tSetId);}

    @Override
    public Optional<TestSettings> findTestSettingsByTimeSettings (Long time) {return Optional.ofNullable(testSettingsRepository.findTestSettingsByTimeSettings(time));}

    @Override
    public Optional<TestSettings> findTestSettingsBySecuritySettings (Boolean security) {return Optional.ofNullable(testSettingsRepository.findTestSettingsBySecuritySettings(security));}

    @Override
    public Optional<TestSettings> findTestSettingsByShowAnsw (Boolean answShow) {return Optional.ofNullable(testSettingsRepository.findTestSettingsByShowAnsw(answShow));}
}
