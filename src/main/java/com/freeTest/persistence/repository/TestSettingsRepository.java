package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.TestSettings;
import org.springframework.data.repository.CrudRepository;

public interface TestSettingsRepository extends CrudRepository <TestSettings, Long> {
    TestSettings findTestSettingsByTimeSettings (Long time);
    TestSettings findTestSettingsBySecuritySettings (Boolean security);
    TestSettings findTestSettingsByShowAnsw (Boolean answShow);
}
