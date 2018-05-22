package com.freeTest.controller;

import com.freeTest.persistence.repository.*;
import com.freeTest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resources;

@RestController
@RequestMapping("Questions")
public class QuestionRestController {

    private final QuestionService questionService;

    public QuestionRestController(QuestionService questionService) {

        this.questionService = questionService;

    }

//    @RequestMapping (method = RequestMethod.GET)
//    Resources <>
}
