package com.freeTest.persistence.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long uId;
    private String uLogin;
    private String uFullName;
    private String uEmail;
    private String uPassword;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uStatus")
    private StatusTable uStatus;
    @OneToMany(mappedBy = "userId")
    private List<Result> results;

       public Users(Long uId, String uLogin, String uFullName, String uEmail, String uPassword, StatusTable status) {
        this.uId = uId;
        this.uLogin = uLogin;
        this.uFullName = uFullName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.uStatus = status;

    }

    public Long getuId() {return uId;}

    public void setuId(Long uId) {this.uId = uId;}

    public String getuLogin() {return uLogin;}

    public void setuLogin(String uLogin) {this.uLogin = uLogin;}

    public String getuFullName() {return uFullName;}

    public void setuFullName(String uFullName) {this.uFullName = uFullName;}

    public String getuEmail() {return uEmail;}

    public void setuEmail(String uEmail) {this.uEmail = uEmail;}

    public String getuPassword() {return uPassword;}

    public void setuPassword(String uPassword) {this.uPassword = uPassword;}

    public StatusTable getuStatus() {return uStatus;}

    public void setuStatus(StatusTable uStatus) {this.uStatus = uStatus;}

    public List<Result> getResults() {return results;}

    public void setResults(List<Result> results) {this.results = results;}
}
