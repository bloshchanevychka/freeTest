package com.freeTest.controller;

import com.freeTest.persistence.repository.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Questions")
public class QuestionRestController {
    private final QuestionsRepository questionsRepository;
    private final QuestionTypeRepository questionTypeRepository;
    private final QuestionLevelRepository questionLevelRepository;
    private final AnswersRepository answersRepository;
    private final QuestionAnswerSetRepository questionAnswerSetRepository;
    private final QuestionSettingsSetRepository questionSettingsSetRepository;
    private final QuestionSettingsRepository questionSettingsRepository;
    // not necessary?
    private final AnswersStatusRepository answersStatusRepository;






}
