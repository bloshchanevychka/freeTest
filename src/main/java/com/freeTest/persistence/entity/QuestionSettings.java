package com.freeTest.persistence.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class QuestionSettings implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long setttingId;
    private Integer answAmount;
    private String help;
    private String picture;

    //protected QuestionSettings () {}

    public QuestionSettings(Integer answAmount, String help, String picture) {
        if (answAmount < 1 || answAmount > 10)
            throw new IllegalArgumentException(answAmount + " is out of range");
        else {
            this.answAmount = answAmount;
            this.help = help;
            this.picture = picture;
        }
    }
}

