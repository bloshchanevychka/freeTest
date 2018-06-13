package com.freeTest.controller;

import com.freeTest.persistence.entity.Subject;
import com.freeTest.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class TestRestController {

    private final TestService testService;

    public TestRestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findSudjectById(@PathVariable Long id){
        Subject subject = testService.findSubject(id);
        return ResponseEntity.ok(subject);
    }

    @GetMapping("/subjects")
    public ResponseEntity<?> getSubList(){
        return ResponseEntity.ok(testService.findAllSubjects());
    }
}
