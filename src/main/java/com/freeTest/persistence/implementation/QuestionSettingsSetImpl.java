package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.QuestionSettingSet;
import com.freeTest.persistence.iImpl.IQuestionSettingsSet;
import com.freeTest.persistence.repository.QuestionSettingsSetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@AllArgsConstructor
public class QuestionSettingsSetImpl implements IQuestionSettingsSet {
    private QuestionSettingsSetRepository questionSettingsSetRepository;

    @Override
    public Optional<QuestionSettingSet> findQuestionSettingSetById(Long qId) {return  questionSettingsSetRepository.findById(qId);}

    @Override
    public Optional<QuestionSettingSet> findQuestionSettingSetBySId(Long settingId) {return Optional.ofNullable(questionSettingsSetRepository.findQuestionSettingSetBySId(settingId));}

    @Override
    public Optional<QuestionSettingSet> findQuestionSettingSetByQIdAndSId(Long qId, Long settingId){return Optional.ofNullable(questionSettingsSetRepository.findQuestionSettingSetByQIdAndSId(qId, settingId));}

    @Override
    public Iterable<QuestionSettingSet> findAll() {return questionSettingsSetRepository.findAll();}

    @Override
    public QuestionSettingSet save(QuestionSettingSet questionSettingSet){return questionSettingsSetRepository.save(questionSettingSet);}
}
