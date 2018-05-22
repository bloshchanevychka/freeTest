package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Answers implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long aId;
    private String answer;
    @OneToMany(mappedBy = "answer")
    private List<QuestionAnswerSet> questionAnswerSets;

   // protected Answers () {}

    public Answers(String answer) {
        this.answer = answer;
    }
}
