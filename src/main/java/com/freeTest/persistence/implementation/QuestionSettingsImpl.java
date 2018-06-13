package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.QuestionSettings;
import com.freeTest.persistence.iImpl.IQuestionSettings;
import com.freeTest.persistence.repository.QuestionSettingsRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class QuestionSettingsImpl implements IQuestionSettings {
    private QuestionSettingsRepository qRepository;

    @Override
    public Optional<QuestionSettings> findQuestionSettingsById(Long qsId) {return qRepository.findById(qsId);}

    @Override
    public Optional<QuestionSettings> findQuestionSettingsByAnswAmount(Integer amount) {return Optional.ofNullable(qRepository.findQuestionSettingsByAnswAmount(amount));}

    @Override
    public List<QuestionSettings> findAll() {return Lists.newArrayList(qRepository.findAll());}

    @Override
    public QuestionSettings save (QuestionSettings questionSettings) {return qRepository.save(questionSettings);}
}
