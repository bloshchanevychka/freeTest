package com.freeTest.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class z1 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long aId;
    private String answer;
    private String question;

    public z1(String answer, String question) {
        this.answer = answer;
        this.question = question;
    }
}
