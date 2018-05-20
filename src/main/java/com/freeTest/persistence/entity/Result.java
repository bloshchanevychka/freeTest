package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Result implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long resId;
    private Long testId;
    private Long userId;
    private Long questionId;
    private Long givenAnswer;
    private Date testDate;
    private Long testTime;

    //protected Result (){}

    public Result(Long testId, Long userId, Long questionId, Long givenAnswer, Date testDaate, Long testTime) {
        this.testId = testId;
        this.userId = userId;
        this.questionId = questionId;
        this.givenAnswer = givenAnswer;
        this.testDate = testDaate;
        this.testTime = testTime;
    }
}
