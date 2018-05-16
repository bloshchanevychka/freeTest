package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.Questions;
import org.springframework.data.repository.CrudRepository;

public interface QuestionsRepository extends CrudRepository <Questions, Long> {
    Questions findQuestionsByQuestionType (Long type);
    Questions findQuestionsByQuestionLevel (Long level);
    Questions findQuestionsByQuestionText (String text);
}
