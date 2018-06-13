package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Entity
public class TestSettingsSet implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long setId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test")
    @JsonBackReference
    private Test test;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "settingSet")
    @JsonBackReference
    private TestSettings settingSet;

    public TestSettingsSet(Test test, TestSettings settingSet) {
        this.test = test;
        this.settingSet = settingSet;
    }

    public Long getSetId() {return setId;}

    public void setSetId(Long setId) {this.setId = setId;}

    public Test getTest() {return test;}

    public void setTest(Test test) {this.test = test;}

    public TestSettings getSettingSet() {return settingSet;}

    public void setSettingSet(TestSettings settingSet) {this.settingSet = settingSet;}
}
