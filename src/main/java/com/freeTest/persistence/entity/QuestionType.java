package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
public class QuestionType implements Serializable {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long typeId;
    private String type;

    @OneToMany(mappedBy = "questionType")
    @JsonManagedReference
    private List<Questions> questions;

    public QuestionType(String type) {this.type = type;}

    public Long getTypeId() {return typeId;}

    public void setTypeId(Long typeId) {this.typeId = typeId;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public List<Questions> getQuestions() {return questions;}

    public void setQuestions(List<Questions> questions) {this.questions = questions;}
}
