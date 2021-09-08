package com.example.elearningportal.controllers;

import com.example.elearningportal.DTOs.User;
import com.example.elearningportal.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServices userServices;
    @Autowired
    PasswordEncoder passwordEncoder;
    @RequestMapping(method = RequestMethod.GET)
    public String getUserRegistration(){
        return "user-registration";
    }
    @RequestMapping(method=RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userServices.saveUser(user);
        return "user-registration";
    }
}
