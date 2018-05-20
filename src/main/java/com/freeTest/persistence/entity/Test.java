package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Test implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long testId;
    private String testName;
    private Long testSubj;
    private String addInfo;

   // protected Test() {}

    public Test(String testName, Long testSubj, String addInfo) {
        this.testName = testName;
        this.testSubj = testSubj;
        this.addInfo = addInfo;
    }
}
