package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.Questions;
import java.util.Optional;

public interface IQuestions {
    Optional<Questions> findQuestionsById(Long questionId);
    Optional<Questions> findQuestionsByQuestionType(Long type);
    Optional<Questions> findQuestionsByQLevel(Long level);
    Optional<Questions> findQuestionsByQuestionText(String text);
    Iterable<Questions> findAll();


}
