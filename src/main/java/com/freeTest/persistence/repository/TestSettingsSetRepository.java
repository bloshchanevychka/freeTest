package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.TestSettingsSet;
import org.springframework.data.repository.CrudRepository;

public interface TestSettingsSetRepository extends CrudRepository <TestSettingsSet,Long> {
    TestSettingsSet findTestSettingsSetByTest (Long test);
    TestSettingsSet findTestSettingsSetBySettingSet (Long setting);
}
