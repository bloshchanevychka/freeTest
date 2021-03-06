package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.QuestionAnswerSet;
import com.freeTest.persistence.entity.QuestionSettingSet;

import java.util.List;
import java.util.Optional;

public interface IQuestionSettingsSet {
    Optional<QuestionSettingSet> findQuestionSettingSetById (Long qId);
    Optional<QuestionSettingSet> findQuestionSettingSetBySId (Long settingId);
    Optional<QuestionSettingSet> findQuestionSettingSetByQIdAndSId (Long qId, Long settingId);
    List<QuestionSettingSet> findAll();
    QuestionSettingSet save (QuestionSettingSet questionSettingSet);
}
