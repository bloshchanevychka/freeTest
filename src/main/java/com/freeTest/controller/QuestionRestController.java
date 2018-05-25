package com.freeTest.controller;

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

    /*GetMapping
    public ResponseEntity<?> findAllQuestions(){

        return ResponseEntity.ok();
    }
    */
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findQuestionById(@PathVariable Long id){
        Questions questions = questionService.findQuestionById(id);
        return ResponseEntity.ok(questions);
    }

//    @PostMapping
    //@ReuestBody
//    @RequestMapping (method = RequestMethod.GET)
//    Resources <>
}
