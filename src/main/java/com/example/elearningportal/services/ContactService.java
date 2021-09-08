package com.example.elearningportal.services;

import com.example.elearningportal.DTOs.Contact;
import com.example.elearningportal.DAOs.ContactRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    ContactRepsitory contactRepsitory;

    public void saveUser(Contact contact){

        contactRepsitory.save(contact);
    }
}
