package com.example.elearningportal.DAOs;

import com.example.elearningportal.DTOs.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepsitory extends JpaRepository<Contact,Integer> {
}
