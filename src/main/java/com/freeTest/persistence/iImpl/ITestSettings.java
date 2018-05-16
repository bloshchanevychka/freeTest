package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.TestSettings;
import java.util.Optional;

public interface ITestSettings {
    Optional<TestSettings> findTestSettingsById (Long tSetId);
    Optional<TestSettings> findTestSettingsByTimeSettings (Long time);
    Optional<TestSettings> findTestSettingsBySecuritySettings (Boolean security);
    Optional<TestSettings> findTestSettingsByShowAnsw (Boolean answShow);
}
