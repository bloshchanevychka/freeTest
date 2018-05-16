package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.QuestionType;
import org.springframework.data.repository.CrudRepository;

public interface QuestionTypeRepository extends CrudRepository <QuestionType, Long> {
    QuestionType findQuestionTypeByType (String type);
}
