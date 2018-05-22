package com.freeTest.persistence.entity;

import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
public class Answers implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long aId;
    private String answer;
    @OneToMany(mappedBy = "answer")
    private List<QuestionAnswerSet> questionAnswerSets;
    @OneToMany(mappedBy = "givenAnswer")
    private List<Result> results;

    public Answers(String answer) {
        this.answer = answer;
    }

    public Long getaId() {return aId;}

    public void setaId(Long aId) {this.aId = aId;}

    public String getAnswer() {return answer;}

    public void setAnswer(String answer) {this.answer = answer;}

    public List<QuestionAnswerSet> getQuestionAnswerSets() {return questionAnswerSets;}

    public void setQuestionAnswerSets(List<QuestionAnswerSet> questionAnswerSets) {this.questionAnswerSets = questionAnswerSets;}

    public List<Result> getResults() {return results;}

    public void setResults(List<Result> results) {this.results = results;}
}
