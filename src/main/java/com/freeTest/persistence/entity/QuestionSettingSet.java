package com.freeTest.persistence.entity;

import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

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

    public QuestionSettingSet(Long qId, Long sId) {
        this.qId.setQuestionId(qId);
        this.sId.setSetttingId(sId);
    }

    public Long getqSettingsSetId() {return qSettingsSetId;}

    public void setqSettingsSetId(Long qSettingsSetId) {this.qSettingsSetId = qSettingsSetId;}

    public Questions getqId() {return qId;}

    public void setqId(Questions qId) {this.qId = qId;}

    public QuestionSettings getsId() {return sId;}

    public void setsId(QuestionSettings sId) {this.sId = sId;}
}
