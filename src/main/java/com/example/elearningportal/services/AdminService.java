package com.example.elearningportal.services;

import com.example.elearningportal.DAOs.Admin;
import com.example.elearningportal.DAOs.User;
import com.example.elearningportal.repository.AdminRepository;
import com.example.elearningportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public void saveUser(Admin admin){

        adminRepository.save(admin);
    }
}
