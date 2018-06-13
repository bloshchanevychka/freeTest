package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
public class Questions implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long questionId;
    private String questionText;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "qLevel")
    @JsonBackReference
    private QuestionLevel qLevel;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "questionType")
    @JsonBackReference
    private QuestionType questionType;
    private String questionAddInfo;

    @OneToMany(mappedBy = "qId")
    @JsonManagedReference
    private List<QuestionSettingSet> questionSettingSetsSets;

    @OneToMany(mappedBy = "questionId")
    @JsonManagedReference
    private List<Result> results;

    @OneToMany(mappedBy = "questionId")
    @JsonManagedReference
    private List<TestSets> testSets;

    public Questions(String questionText, QuestionLevel qLevel, QuestionType questionType, String questionAddInfo) {
        this.questionText = questionText;
        this.qLevel = qLevel;
        this.questionType = questionType;
        this.questionAddInfo = questionAddInfo;
    }

    public Long getQuestionId() {return questionId;}

    public void setQuestionId(Long questionId) {this.questionId = questionId;}

    public String getQuestionText() {return questionText;}

    public void setQuestionText(String questionText) {this.questionText = questionText;}

    public QuestionLevel getqLevel() {return qLevel;}

    public void setqLevel(QuestionLevel qLevel) {this.qLevel = qLevel;}

    public QuestionType getQuestionType() {return questionType;}

    public void setQuestionType(QuestionType questionType) {this.questionType = questionType;}

    public String getQuestionAddInfo() {return questionAddInfo;}

    public void setQuestionAddInfo(String questionAddInfo) {this.questionAddInfo = questionAddInfo;}

    public List<QuestionSettingSet> getQuestionSettingSetsSets() {return questionSettingSetsSets;}

    public void setQuestionSettingSetsSets(List<QuestionSettingSet> questionSettingSetsSets) {this.questionSettingSetsSets = questionSettingSetsSets;}

    public List<Result> getResults() {return results;}

    public void setResults(List<Result> results) {this.results = results;}

    public List<TestSets> getTestSets() {return testSets;}

    public void setTestSets(List<TestSets> testSets) {this.testSets = testSets;}
}
