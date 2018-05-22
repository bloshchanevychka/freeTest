package com.freeTest.persistence.entity;

import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
public class AnswerStatus implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long answerStId;
    private boolean aStatus;
    @OneToMany(mappedBy = "status")
    private List <QuestionAnswerSet> questionAnswerSets;

    public AnswerStatus(boolean aStatus) {
        this.aStatus = aStatus;
    }

    public Long getAnswerStId() {return answerStId;}

    public void setAnswerStId(Long answerStId) {this.answerStId = answerStId;}

    public boolean isaStatus() {return aStatus;}

    public void setaStatus(boolean aStatus) {this.aStatus = aStatus;}

    public List<QuestionAnswerSet> getQuestionAnswerSets() {return questionAnswerSets;}

    public void setQuestionAnswerSets(List<QuestionAnswerSet> questionAnswerSets) {this.questionAnswerSets = questionAnswerSets;}
}
