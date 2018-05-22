package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.TestSettingsSet;
import java.util.Optional;

public interface ITestSettingsSet {
    Optional<TestSettingsSet> findTestSettingsSetById (Long tssId);
    Optional<TestSettingsSet> findTestSettingsSetByTest (Long test);
    Optional<TestSettingsSet> findTestSettingsSetBySettingSet (Long setting);
    Iterable<TestSettingsSet> findAll();
}
