package com.example.elearningportal.services;

import com.example.elearningportal.DTOs.Admin;
import com.example.elearningportal.DAOs.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public void saveUser(Admin admin){

        adminRepository.save(admin);
    }
}
