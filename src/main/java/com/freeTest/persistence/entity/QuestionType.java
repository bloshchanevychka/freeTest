package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class QuestionType implements Serializable {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long typeId;
    private String type;

    @OneToMany(mappedBy = "questionType")
    private List<Questions> questions;

    //protected QuestionType() {}

    public QuestionType(String type) {
        this.type = type;
    }
}
