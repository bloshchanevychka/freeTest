package com.freeTest.persistence.iImpl;


import com.freeTest.persistence.entity.Answers;
import java.util.Optional;

public interface IAnswers {
    Optional<Answers> findAnswersById(Long id);
    Optional<Answers> findAnswerByAnswer(String answer);
    Iterable<Answers> findAll();
    Answers save(Answers answers);

}
