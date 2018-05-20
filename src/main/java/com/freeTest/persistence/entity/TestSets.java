package com.freeTest.persistence.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class TestSets implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long testSetId;
    private Long testId;
    private Long questionId;

    //protected TestSets () {}

    public TestSets(Long testId, Long questionId) {
        this.testId = testId;
        this.questionId = questionId;
    }
}
