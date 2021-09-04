package com.example.elearningportal.repository;

import com.example.elearningportal.DAOs.Contact;
import com.example.elearningportal.DAOs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepsitory extends JpaRepository<Contact,Integer> {
}
