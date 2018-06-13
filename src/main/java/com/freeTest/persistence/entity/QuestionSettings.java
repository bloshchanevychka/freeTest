package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    @JsonManagedReference
    private List<QuestionSettingSet> questionSettingSetsSets;

    public QuestionSettings(Integer answAmount, String help, String picture) {
        if (answAmount < 1 || answAmount > 10)
            throw new IllegalArgumentException(answAmount + " is out of range");
        else {
            this.answAmount = answAmount;
            this.help = help;
            this.picture = picture;
        }
    }

    public Long getSetttingId() {return setttingId;}

    public void setSetttingId(Long setttingId) {this.setttingId = setttingId;}

    public Integer getAnswAmount() {return answAmount;}

    public void setAnswAmount(Integer answAmount) {this.answAmount = answAmount;}

    public String getHelp() {return help;}

    public void setHelp(String help) {this.help = help;}

    public String getPicture() {return picture;}

    public void setPicture(String picture) {this.picture = picture;}

    public List<QuestionSettingSet> getQuestionSettingSetsSets() {return questionSettingSetsSets;}

    public void setQuestionSettingSetsSets(List<QuestionSettingSet> questionSettingSetsSets) {this.questionSettingSetsSets = questionSettingSetsSets;}
}

