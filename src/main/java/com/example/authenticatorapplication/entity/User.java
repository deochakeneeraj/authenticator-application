package com.example.authenticatorapplication.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    private int userId;
    private String userName;
    private String password;
    private String token;
    private String refreshToken;
    private Date tokenExpiryDate;
    private String urlOrigin;
    private String userType;
    private String userRole;
}
