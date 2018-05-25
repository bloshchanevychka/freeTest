package com.freeTest.persistence.entity;

import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Entity
public class QuestionAnswerSet implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long setId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question")
    private Questions question;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "answer")
    private Answers answer;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "status")
    private AnswerStatus status;

    public QuestionAnswerSet(Questions question, Answers answer, AnswerStatus status) {
        this.question = question;
        this.answer = answer;
        this.status = status;
    }

    public Long getSetId() {return setId;}

    public void setSetId(Long setId) {this.setId = setId;}

    public Questions getQuestion() {return question;}

    public void setQuestion(Questions question) {this.question = question;}

    public Answers getAnswer() {return answer;}

    public void setAnswer(Answers answer) {this.answer = answer;}

    public AnswerStatus getStatus() {return status;}

    public void setStatus(AnswerStatus status) {this.status = status;}
}
