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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long questionLevelId;
    private String questionLevel;

    //protected QuestionLevel () {}

    public QuestionLevel(String level) {
        this.questionLevel = level;
    }
}
