package com.example.elearningportal.controllers;

import com.example.elearningportal.DTOs.User;
import com.example.elearningportal.DTOs.requests.CreateLoginRequest;
import com.example.elearningportal.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/login")
public class LoginController {
        @RequestMapping(method = RequestMethod.GET)
        public String login(){
            return "login";
        }

}
