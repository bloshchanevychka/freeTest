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
    private Long qId;
    private Long sId;

   // protected QuestionSettingSet() {}

    public QuestionSettingSet(Long qId, Long sId) {
        this.qId = qId;
        this.sId = sId;
    }
}
