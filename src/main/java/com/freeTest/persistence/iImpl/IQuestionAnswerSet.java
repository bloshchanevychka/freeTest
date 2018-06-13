package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.QuestionAnswerSet;

import java.util.List;
import java.util.Optional;

public interface IQuestionAnswerSet {
    Optional<QuestionAnswerSet> findQuestionAnswerSetById(Long id);
    Optional<QuestionAnswerSet>  findQuestionAnswerSetByQuestion(Long qId);
    Optional<QuestionAnswerSet> findQuestionAnswerSetByAnswer(Long aId);
    Optional<QuestionAnswerSet> findQuestionAnswerSetByStatus(Long sId);
    List<QuestionAnswerSet> findAll();
    QuestionAnswerSet save(QuestionAnswerSet questionAnswerSet);
}
