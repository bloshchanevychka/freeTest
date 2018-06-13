package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
public class Test implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long testId;
    private String testName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "testSubj")
    @JsonBackReference
    private Subject testSubj;
    private String addInfo;

    @OneToMany(mappedBy = "test")
    @JsonManagedReference
    private List<TestSettingsSet> testSettingSetsSets;

    @OneToMany(mappedBy = "testId")
    @JsonManagedReference
    private List<TestSets> testSets;

    public Test(String testName, Subject testSubj, String addInfo) {
        this.testName = testName;
        this.testSubj = testSubj;
        this.addInfo = addInfo;
    }

    public Long getTestId() {return testId;}

    public void setTestId(Long testId) {this.testId = testId;}

    public String getTestName() {return testName;}

    public void setTestName(String testName) {this.testName = testName;}

    public Subject getTestSubj() {return testSubj;}

    public void setTestSubj(Subject testSubj) {this.testSubj = testSubj;}

    public String getAddInfo() {return addInfo;}

    public void setAddInfo(String addInfo) {this.addInfo = addInfo;}

    public List<TestSettingsSet> getTestSettingSetsSets() {return testSettingSetsSets;}

    public void setTestSettingSetsSets(List<TestSettingsSet> testSettingSetsSets) {this.testSettingSetsSets = testSettingSetsSets;}

    public List<TestSets> getTestSets() {return testSets;}

    public void setTestSets(List<TestSets> testSets) {this.testSets = testSets;}
}
