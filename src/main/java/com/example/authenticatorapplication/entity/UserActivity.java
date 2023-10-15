package com.example.authenticatorapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserActivity {
    @Id
    private int userId;
    private String token;
    private String refreshToken;
    private Date tokenExpiryDate;

    @OneToOne
    @MapsId //Both tables used same primary key for bidirectional mapping
    private User user;
}
