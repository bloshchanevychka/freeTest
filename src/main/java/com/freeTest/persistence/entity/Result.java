package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Entity
public class Result implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long resId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "testId")
    @JsonBackReference
    private Test testId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    @JsonBackReference
    private Users userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questionId")
    @JsonBackReference
    private Questions questionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "givenAnswer")
    @JsonBackReference
    private Answers givenAnswer;
    private Date testDate;
    private Long testTime;

    public Result(Test testId, Users userId, Questions questionId, Answers givenAnswer, Date testDate, Long testTime) {
        this.testId = testId;
        this.userId = userId;
        this.questionId = questionId;
        this.givenAnswer = givenAnswer;
        this.testDate = testDate;
        this.testTime = testTime;
    }

    public Long getResId() {return resId;}

    public void setResId(Long resId) {this.resId = resId;}

    public Test getTestId() {return testId;}

    public void setTestId(Test testId) {this.testId = testId;}

    public Users getUserId() {return userId;}

    public void setUserId(Users userId) {this.userId = userId;}

    public Questions getQuestionId() {return questionId;}

    public void setQuestionId(Questions questionId) {this.questionId = questionId;}

    public Answers getGivenAnswer() {return givenAnswer;}

    public void setGivenAnswer(Answers givenAnswer) {this.givenAnswer = givenAnswer;}

    public Date getTestDate() {return testDate;}

    public void setTestDate(Date testDate) {this.testDate = testDate;}

    public Long getTestTime() {return testTime;}

    public void setTestTime(Long testTime) {this.testTime = testTime;}
}
