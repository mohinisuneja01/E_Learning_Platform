package com.example.elearningportal.DAOs;

import com.example.elearningportal.DTOs.Enrollment;
import com.example.elearningportal.DTOs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment,Integer> {
    public List<Enrollment> findByUser(User user);
}
