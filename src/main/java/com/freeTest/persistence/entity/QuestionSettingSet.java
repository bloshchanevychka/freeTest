package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class QuestionSettingSet implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long qSettingsSetId;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "qId")
    private Questions qId;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "sId")
    private QuestionSettings sId;

   // protected QuestionSettingSet() {}

    public QuestionSettingSet(Questions qId, QuestionSettings sId) {
        this.qId = qId;
        this.sId = sId;
    }
}
