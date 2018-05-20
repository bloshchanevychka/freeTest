package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Data
public class Answers implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long aId;
    private String answer;
    private Long status;

   // protected Answers () {}

    public Answers(String answer) {
        this.answer = answer;
    }
}
