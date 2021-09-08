package com.example.elearningportal.controllers;

import com.example.elearningportal.DTOs.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String getHomePage(@AuthenticationPrincipal UserDetails user, ModelMap modelMap){
        modelMap.addAttribute("user",user);
        return "home";
    }

}
