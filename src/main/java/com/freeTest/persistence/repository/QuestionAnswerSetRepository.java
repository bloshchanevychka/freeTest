package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.QuestionAnswerSet;
import org.springframework.data.repository.CrudRepository;

public interface QuestionAnswerSetRepository extends CrudRepository <QuestionAnswerSet, Long> {
    QuestionAnswerSet findQuestionAnswerSetByQuestion (Long qId);
    QuestionAnswerSet findQuestionAnswerSetByAnswer (Long aId);
    QuestionAnswerSet findQuestionAnswerSetByStatus (Long sId);
}
