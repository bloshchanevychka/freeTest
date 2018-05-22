package com.freeTest.persistence.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class QuestionSettings implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long setttingId;
    private Integer answAmount;
    private String help;
    private String picture;

    @OneToMany(mappedBy = "sId")
    private List<QuestionSettingSet> questionSettingSetsSets;

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

