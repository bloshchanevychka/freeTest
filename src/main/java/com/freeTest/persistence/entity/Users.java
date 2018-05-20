package com.freeTest.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Long uStatus;

    //protected Users() {}

    public Users(String uLogin, String uFullName, String uEmail, String uPassword, Long uStatus) {
        this.uLogin = uLogin;
        this.uFullName = uFullName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.uStatus = uStatus;
    }
}
