package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
public class QuestionLevel implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long questionLevelId;
    private String questionLevel;

    @OneToMany(mappedBy = "qLevel")
    @JsonManagedReference
    private List<Questions> questions;

    public QuestionLevel(String level) {this.questionLevel = level;}

    public Long getQuestionLevelId() {return questionLevelId;}

    public void setQuestionLevelId(Long questionLevelId) {this.questionLevelId = questionLevelId;}

    public String getQuestionLevel() {return questionLevel;}

    public void setQuestionLevel(String questionLevel) {this.questionLevel = questionLevel;}

    public List<Questions> getQuestions() {return questions;}

    public void setQuestions(List<Questions> questions) {this.questions = questions;}
}
