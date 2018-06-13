package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JsonBackReference
    private Questions qId;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "sId")
    @JsonBackReference
    private QuestionSettings sId;

    public QuestionSettingSet(Questions qId, QuestionSettings sId) {
        this.qId = qId;
        this.sId = sId;
    }

    public Long getqSettingsSetId() {return qSettingsSetId;}

    public void setqSettingsSetId(Long qSettingsSetId) {this.qSettingsSetId = qSettingsSetId;}

    public Questions getqId() {return qId;}

    public void setqId(Questions qId) {this.qId = qId;}

    public QuestionSettings getsId() {return sId;}

    public void setsId(QuestionSettings sId) {this.sId = sId;}
}
