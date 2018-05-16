package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.QuestionLevel;
import org.springframework.data.repository.CrudRepository;

public interface QuestionLevelRepository extends CrudRepository <QuestionLevel, Long> {
    QuestionLevel findQuestionLevelByQuestionLevel (String qLevel);
}
