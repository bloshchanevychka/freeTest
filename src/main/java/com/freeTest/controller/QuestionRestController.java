package com.freeTest.controller;

import com.freeTest.persistence.entity.QuestionType;
import com.freeTest.persistence.entity.Questions;
import com.freeTest.persistence.repository.*;
import com.freeTest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resources;

@RestController
@RequestMapping("/questions")
public class QuestionRestController {

    private final QuestionService questionService;

    public QuestionRestController(QuestionService questionService) {
        this.questionService = questionService;
    }

       @GetMapping(value = "/{id}")
    public ResponseEntity<?> findQuestionById(@PathVariable Long id){
        Questions questions = questionService.findQuestionById(id);
        return ResponseEntity.ok(questions);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Questions questions,String qType, String qLevel){
        Questions questionsResult = questionService.createQuestion(questions,qType, qLevel);
        return ResponseEntity.ok(questions);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody String qType){
        QuestionType questions = questionService.createQType(qType);
        return ResponseEntity.ok(questions);
    }


}
