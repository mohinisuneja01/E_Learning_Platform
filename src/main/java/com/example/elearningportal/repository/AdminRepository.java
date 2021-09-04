package com.example.elearningportal.repository;

import com.example.elearningportal.DAOs.Admin;
import com.example.elearningportal.DAOs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
