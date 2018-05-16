package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.QuestionSettings;
import com.freeTest.persistence.iImpl.IQuestionSettings;
import com.freeTest.persistence.repository.QuestionSettingsRepository;
import java.util.Optional;

public class QuestionSettingsImpl implements IQuestionSettings {
    private QuestionSettingsRepository qRepository;

    public QuestionSettingsImpl(QuestionSettingsRepository qRepository) {this.qRepository = qRepository;}

    @Override
    public Optional<QuestionSettings> findQuestionSettingsById(Long qsId) {return qRepository.findById(qsId);}

    @Override
    public Optional<QuestionSettings> findQuestionSettingsByAnswAmount(Integer amount) {return Optional.ofNullable(qRepository.findQuestionSettingsByAnswAmount(amount));}

}
