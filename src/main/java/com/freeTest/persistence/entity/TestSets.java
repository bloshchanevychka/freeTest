package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Entity
public class TestSets implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long testSetId;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "testId")
    @JsonBackReference
    private Test testId;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "questionId")
    @JsonBackReference
    private Questions questionId;

    public TestSets(Test testId, Questions questionId) {
        this.testId = testId;
        this.questionId = questionId;
    }

    public Long getTestSetId() {return testSetId;}

    public void setTestSetId(Long testSetId) {this.testSetId = testSetId;}

    public Test getTestId() {return testId;}

    public void setTestId(Test testId) {this.testId = testId;}

    public Questions getQuestionId() {return questionId;}

    public void setQuestionId(Questions questionId) {this.questionId = questionId;}
}
