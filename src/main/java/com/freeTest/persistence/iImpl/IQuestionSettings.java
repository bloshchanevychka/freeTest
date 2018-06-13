package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.QuestionSettings;

import java.util.List;
import java.util.Optional;

public interface IQuestionSettings {
    Optional <QuestionSettings> findQuestionSettingsById(Long qsId);
    Optional<QuestionSettings> findQuestionSettingsByAnswAmount(Integer amount);
    List<QuestionSettings> findAll();
    QuestionSettings save(QuestionSettings questionSettings);
}
