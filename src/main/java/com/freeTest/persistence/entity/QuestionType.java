package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class QuestionType implements Serializable {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long typeId;
    private String type;

    //protected QuestionType() {}

    public QuestionType(String type) {
        this.type = type;
    }
}
