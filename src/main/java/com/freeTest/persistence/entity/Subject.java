package com.freeTest.persistence.entity;

import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long subjId;
    private String subject;
    @OneToMany(mappedBy = "testSubj")
    private List<Test> tests;

    public Subject(String subject) {this.subject = subject;}

    public Long getSubjId() {return subjId;}

    public void setSubjId(Long subjId) {this.subjId = subjId;}

    public String getSubject() {return subject;}

    public void setSubject(String subject) {this.subject = subject;}

    public List<Test> getTests() {return tests;}

    public void setTests(List<Test> tests) {this.tests = tests;}
}
