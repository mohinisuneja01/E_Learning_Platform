package com.example.elearningportal.security;

import com.example.elearningportal.DTOs.Admin;
import com.example.elearningportal.DTOs.User;
import com.example.elearningportal.DAOs.AdminRepository;
import com.example.elearningportal.DAOs.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public AdminRepository adminRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails user;
        user =userRepository.findByUserId(Integer.parseInt(s));
        if(user==null) {
            user = adminRepository.findByAdminId(Integer.parseInt(s));
        }
        if(user==null)
            throw new UsernameNotFoundException(s);
        return user;
    }
}
