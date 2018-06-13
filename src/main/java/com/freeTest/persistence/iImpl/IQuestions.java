package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.Questions;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import java.util.List;
import java.util.Optional;

public interface IQuestions {
    Optional<Questions> findQuestionsById(Long questionId);
    Optional<Questions> findQuestionsByQuestionType(Long type);
    Optional<Questions> findQuestionsByQLevel(Long level);
    Optional<Questions> findQuestionsByQuestionText(String text);
    List<Questions> findAll();
    Questions save(Questions questions);


}
