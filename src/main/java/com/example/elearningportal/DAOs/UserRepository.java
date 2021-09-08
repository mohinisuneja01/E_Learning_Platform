package com.example.elearningportal.DAOs;

import com.example.elearningportal.DTOs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User getByEmail(String string);
    User findByUserId(int userId);
}
