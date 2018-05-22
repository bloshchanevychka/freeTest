package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.Answers;
import org.springframework.data.repository.CrudRepository;

public interface AnswersRepository extends CrudRepository <Answers, Long> {
    Answers findAnswersByAnswer(String answer);
}
