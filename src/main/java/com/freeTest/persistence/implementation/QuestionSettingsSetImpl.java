package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.QuestionSettingSet;
import com.freeTest.persistence.iImpl.IQuestionSettingsSet;
import com.freeTest.persistence.repository.QuestionSettingsSetRepository;

import java.util.Optional;

public class QuestionSettingsSetImpl implements IQuestionSettingsSet {
    private QuestionSettingsSetRepository questionSettingsSetRepository;

    public QuestionSettingsSetImpl(QuestionSettingsSetRepository questionSettingsSetRepository) {
        this.questionSettingsSetRepository = questionSettingsSetRepository;
    }

    @Override
    public Optional<QuestionSettingSet> findQuestionSettingSetById (Long qId) {
        return  questionSettingsSetRepository.findById(qId);
    }

    @Override
    public Optional<QuestionSettingSet> findQuestionSettingSetBySId (Long settingId) {
        return Optional.ofNullable(questionSettingsSetRepository.findQuestionSettingSetBySId(settingId));
    }

    @Override
    public Optional<QuestionSettingSet> findQuestionSettingSetByQIdAndSId (Long qId, Long settingId){
        return Optional.ofNullable(questionSettingsSetRepository.findQuestionSettingSetByQIdAndSId(qId, settingId));
    }
}