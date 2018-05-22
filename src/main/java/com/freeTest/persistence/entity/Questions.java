package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Questions implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long questionId;
    private String questionText;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "questionLevel")
    private QuestionLevel questionLevel;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "questionType")
    private QuestionType questionType;
    private String questionAddInfo;
    @OneToMany(mappedBy = "qId")
    private List<QuestionSettingSet> questionSettingSetsSets;


  //  protected Questions() {}

    public Questions(String questionText, QuestionLevel questionLevel, QuestionType questionType, String questionAddInfo) {
        this.questionText = questionText;
        this.questionLevel = questionLevel;
        this.questionType = questionType;
        this.questionAddInfo = questionAddInfo;
    }
}
