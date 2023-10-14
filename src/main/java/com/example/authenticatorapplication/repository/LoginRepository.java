package com.example.authenticatorapplication.repository;

import com.example.authenticatorapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<User,Integer> {
}
