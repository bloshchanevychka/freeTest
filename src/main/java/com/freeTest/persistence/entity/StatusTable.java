package com.freeTest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
public class StatusTable implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long statusId;
    private Integer status;

    @OneToMany(mappedBy = "uStatus")
    @JsonManagedReference
    private List <Users> users;

    public StatusTable (Integer status) {this.status = status;}

    public Long getStatusId() {return statusId;}

    public void setStatusId(Long statusId) {this.statusId = statusId;}

    public Integer getStatus() {return status;}

    public void setStatus(Integer status) {this.status = status;}

    public List<Users> getUsers() {return users;}

    public void setUsers(List<Users> users) {this.users = users;}

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
