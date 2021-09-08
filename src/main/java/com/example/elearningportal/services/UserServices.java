package com.example.elearningportal.services;

import com.example.elearningportal.DTOs.User;
import com.example.elearningportal.DAOs.UserRepository;
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
    public User getUser(String email){
         User user=userRepository.getByEmail(email);
         if(user==null)
             return null;
       return userRepository.getByEmail(email);
    }
}
