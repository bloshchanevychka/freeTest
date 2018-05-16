package com.freeTest.persistence.iImpl;


import com.freeTest.persistence.entity.QuestionSettings;
import java.util.Optional;

public interface IQuestionSettings {
    Optional<QuestionSettings> findQuestionSettingsByAnswAmount(Integer amount);
}
