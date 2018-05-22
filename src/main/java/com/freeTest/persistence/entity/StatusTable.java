package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class StatusTable implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long statusId;
    private Integer status;
    @OneToMany(mappedBy = "uStatus")
    private List <Users> users;

   // protected StatusTable () {}

    public StatusTable (Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        switch (this.status){
            case 0:
                return String.format(
                        "Status [id=%d, Status='admin'",  statusId);
            case 1:
                return String.format(
                        "Status [id=%d, Status='teacher'",  statusId);
             default:
                 return String.format(
                         "Status [id=%d, Status='Student'",  statusId);

        }

    }
}
