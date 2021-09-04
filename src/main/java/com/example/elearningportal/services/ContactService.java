package com.example.elearningportal.services;

import com.example.elearningportal.DAOs.Contact;
import com.example.elearningportal.DAOs.User;
import com.example.elearningportal.repository.ContactRepsitory;
import com.example.elearningportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class ContactService {
    @Autowired
    ContactRepsitory contactRepsitory;

    public void saveUser(Contact contact){

        contactRepsitory.save(contact);
    }
}
