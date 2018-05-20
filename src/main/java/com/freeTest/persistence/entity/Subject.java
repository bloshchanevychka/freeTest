package com.freeTest.persistence.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long subjId;
    private String subject;

   // protected Subject () {}

    public Subject(String subject) {
        this.subject = subject;
    }
}
