package com.example.elearningportal.DAOs;

import com.example.elearningportal.DTOs.Admin;
import com.example.elearningportal.DTOs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Admin findByAdminId(int adminId);
}
