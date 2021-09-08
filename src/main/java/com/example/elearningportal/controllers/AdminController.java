package com.example.elearningportal.controllers;

import com.example.elearningportal.DAOs.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/users")
public class AdminController {
@Autowired
UserRepository userRepository;
@GetMapping
public String getUsers(ModelMap modelMap){
modelMap.addAttribute("users",userRepository.findAll());
return "all-users";
}
}
