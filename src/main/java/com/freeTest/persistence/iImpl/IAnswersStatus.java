package com.freeTest.persistence.iImpl;


import com.freeTest.persistence.entity.AnswerStatus;
import java.util.Optional;

public interface IAnswersStatus {
    Optional<AnswerStatus> findAnswerStatusById(Long id);
    Optional<AnswerStatus> findAnswerStatusByaStatus(boolean answerSt);
}
