package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Questions;
import com.freeTest.persistence.iImpl.IQuestions;
import com.freeTest.persistence.repository.QuestionsRepository;
import java.util.Optional;

public class QuestionsImpl implements IQuestions {
    private QuestionsRepository qRepository;

    public QuestionsImpl(QuestionsRepository qRepository) {
        this.qRepository = qRepository;
    }
    @Override
    public Optional<Questions> findQuestionsById(Long questionId) {
        return qRepository.findById(questionId);
    }

    @Override
    public Optional<Questions> findQuestionsByQuestionType(Long type) {return Optional.ofNullable(qRepository.findQuestionsByQuestionType(type));}

    @Override
    public Optional<Questions> findQuestionsByQuestionLevel(Long level){return Optional.ofNullable(qRepository.findQuestionsByQuestionLevel(level));}

    @Override
    public Optional<Questions> findQuestionsByQuestionText(String text) {return Optional.ofNullable(qRepository.findQuestionsByQuestionText(text));}


}
