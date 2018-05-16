package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Questions implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long questionId;
    private String questionText;
    private Long questionLevel;
    private Long questionType;
    private String questionAddInfo;

  //  protected Questions() {}

    public Questions(String questionText, Long questionLevel, Long questionType, String questionAddInfo) {
        this.questionText = questionText;
        this.questionLevel = questionLevel;
        this.questionType = questionType;
        this.questionAddInfo = questionAddInfo;
    }
}
