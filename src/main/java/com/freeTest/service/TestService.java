package com.freeTest.service;

import com.freeTest.persistence.entity.*;
import com.freeTest.persistence.iImpl.ISubject;
import com.freeTest.persistence.iImpl.ITest;
import com.freeTest.persistence.iImpl.ITestSettings;
import com.freeTest.persistence.iImpl.ITestSettingsSet;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class TestService {
    private ISubject iSubject;
    private ITest iTest;
    private ITestSettings iTestSettings;
    private ITestSettingsSet iTestSettingsSet;
    private QuestionService questionService;

    private Test findTestById(Long id){
       return iTest.findTestById(id).orElseThrow(()->new RuntimeException());
    }

    private Subject createSubject (String subject){
        Subject subj = new Subject(subject);
        subj = iSubject.save(subj);
        return subj;
    }

    private TestSettings createTestSettings (Long timeSettings, boolean securitySettings, boolean showAnsw, String help, boolean showRules){
        TestSettings testSettings = new TestSettings(timeSettings, securitySettings, showAnsw, help, showRules);
        testSettings = iTestSettings.save(testSettings);
        return testSettings;
    }

//    private TestSets createTest(String testName, Subject testSubj, String addInfo, Long testID, Long questionID){
//
//        Test test = iTest.findTestById(testID).orElseThrow(()->new RuntimeException());
//
//
//        QuestionType questionType = iQuestionType.findQuestionTypeByType(qType).orElseThrow(()->new RuntimeException());
//        QuestionLevel questionLevel = iQuestionLevel.findQuestionLevelByQuestionLevel(qLevel).orElseThrow(()->new RuntimeException());
//        Questions questions = new Questions(qText, questionLevel, questionType, qAddInfo);
//        questions.setQuestionType(questionType);
//        questions.setqLevel(questionLevel);
//        questions = iQuestions.save(questions);
//        return questions;
//    }
}

