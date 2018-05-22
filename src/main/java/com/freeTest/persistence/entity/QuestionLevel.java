package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class QuestionLevel implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long questionLevelId;
    private String level;
    @OneToMany(mappedBy = "questionLevel")
    private List<QuestionLevel> questionLevel;

    //protected QuestionLevel () {}

    public QuestionLevel(String level) {
        this.level = level;
    }
}
