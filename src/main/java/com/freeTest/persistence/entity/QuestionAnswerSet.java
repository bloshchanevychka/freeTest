package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
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

   // protected QuestionAnswerSet () {}

    public QuestionAnswerSet(Questions question, Answers answer, AnswerStatus status) {
        this.question = question;
        this.answer = answer;
        this.status = status;
    }
}
