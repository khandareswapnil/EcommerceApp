package com.online.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UserInfoMaster")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private Integer id;

    @Column(name = "uname")
    private String name;

    @Column(name = "uemail")
    private String email;

    @Column(name = "ucontact")
    private String contact;

    @Column(name = "udob")
    private String dob;

    @Column(name = "upassword")
    private String password;

   
}
