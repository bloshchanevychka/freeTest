package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class AnswerStatus implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long answerStId;
    private boolean aStatus;

    @OneToMany(mappedBy = "status")
    private List <QuestionAnswerSet> questionAnswerSets;
  //  protected AnswerStatus () {}

    public AnswerStatus(boolean aStatus) {
        this.aStatus = aStatus;
    }
}
