package com.freeTest.persistence.iImpl;


import com.freeTest.persistence.entity.Answers;

import java.util.List;
import java.util.Optional;

public interface IAnswers {
    Optional<Answers> findAnswersById(Long id);
    Optional<Answers> findAnswerByAnswer(String answer);
    List<Answers> findAll();
    Answers save(Answers answers);

}
