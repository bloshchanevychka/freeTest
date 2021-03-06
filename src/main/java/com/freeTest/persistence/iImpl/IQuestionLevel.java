package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.QuestionLevel;

import java.util.List;
import java.util.Optional;

public interface IQuestionLevel {
    Optional<QuestionLevel> findQuestionLevelById(Long id);
    Optional<QuestionLevel> findQuestionLevelByQuestionLevel(String qLevel);
    List<QuestionLevel> findAll();
    QuestionLevel save(QuestionLevel questionLevel);
}
