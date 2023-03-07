package com.htrap.FTP_Client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class LoginCred {
    @Id
    Integer u_id;
    @Column(name = "userName")
    String userName;
    @Column(name = "password")
    String password;
}
