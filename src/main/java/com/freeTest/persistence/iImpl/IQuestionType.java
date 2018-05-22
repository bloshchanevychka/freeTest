package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.QuestionType;
import java.util.Optional;

public interface IQuestionType {
    Optional<QuestionType> findQuestionTypeById (Long qId);
    Optional<QuestionType> findQuestionTypeByType (String type);
    Iterable<QuestionType> findAll();
}
