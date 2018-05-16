package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.QuestionSettings;
import org.springframework.data.repository.CrudRepository;

public interface QuestionSettingsRepository extends CrudRepository <QuestionSettings, Long> {
    QuestionSettings findQuestionSettingsByAnswAmount(Integer amount);
}
