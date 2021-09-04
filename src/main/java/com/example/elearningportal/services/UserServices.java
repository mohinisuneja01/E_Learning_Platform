package com.example.elearningportal.services;

import com.example.elearningportal.DAOs.User;
import com.example.elearningportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public void saveUser(User user){
        user.setRegDate(Date.valueOf(LocalDate.now()));
        userRepository.save(user);
    }
}
