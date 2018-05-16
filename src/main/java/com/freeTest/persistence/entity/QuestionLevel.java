package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class QuestionLevel implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long questionLevelId;
    private String questionLevel;

    //protected QuestionLevel () {}

    public QuestionLevel(String questionLevel) {
        this.questionLevel = questionLevel;
    }
}
