package com.freeTest.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long uId;
    private String uLogin;
    private String uFullName;
    private String uEmail;
    private String uPassword;
    //private Long uStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uStatus")
    private StatusTable uStatus;


    //protected Users() {}

    public Users(Long uId, String uLogin, String uFullName, String uEmail, String uPassword, StatusTable status) {
        this.uId = uId;
        this.uLogin = uLogin;
        this.uFullName = uFullName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
       // this.uStatus = uStatus; , Long uStatus
        this.uStatus = status;
    }
}
