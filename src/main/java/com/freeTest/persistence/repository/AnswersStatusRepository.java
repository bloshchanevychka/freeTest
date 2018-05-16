package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.AnswerStatus;
import org.springframework.data.repository.CrudRepository;

public interface AnswersStatusRepository extends CrudRepository <AnswerStatus, Long> {
    AnswerStatus findAnswerStatusByAStatus (boolean answerSt);
}
