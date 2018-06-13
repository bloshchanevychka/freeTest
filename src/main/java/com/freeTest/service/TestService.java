package com.freeTest.service;

import com.freeTest.persistence.entity.*;
import com.freeTest.persistence.iImpl.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class TestService {
    private ISubject iSubject;
    private ITest iTest;
    private ITestSettings iTestSettings;
    private ITestSettingsSet iTestSettingsSet;
    private IQuestionType iQuestionType;
    private IQuestionLevel iQuestionLevel;
    private IQuestionSettings iQuestionSettings;
    private IQuestionSettingsSet iQuestionSettingsSet;

    private QuestionService questionService;

    public Test findTestById(Long id){
       return iTest.findTestById(id).orElseThrow(()->new RuntimeException());
    }
    public Subject findSubject(Long id){
        return iSubject.findSubjectById(id).orElseThrow(()->new RuntimeException());
    }

    public List<Subject> findAllSubjects(){
        return iSubject.findAll();
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

    private TestSets createTest (String testName, Subject testSubj, String testAddInfo, String question){
        Test test = new Test(testName, testSubj, testAddInfo);
        TestSets testSets= new TestSets(test, questionService.findQuestionByQText(question));
        return testSets;
    }



}

