package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.QuestionSettingSet;
import org.springframework.data.repository.CrudRepository;

public interface QuestionSettingsSetRepository extends CrudRepository <QuestionSettingSet, Long> {
    QuestionSettingSet findQuestionSettingSetByQId (Long qId);
    QuestionSettingSet findQuestionSettingSetBySId (Long settingId);
    QuestionSettingSet findQuestionSettingSetByQIdAndSId (Long qId, Long settingId);

}
