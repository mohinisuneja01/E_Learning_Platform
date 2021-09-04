package com.example.elearningportal.controllers;

import com.example.elearningportal.DAOs.Contact;
import com.example.elearningportal.DAOs.requests.CreateContactRequest;
import com.example.elearningportal.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    ContactService contactServices;

    @RequestMapping(method = RequestMethod.GET)
    public String getUserRegistration(){
        return "contact-add";
    }
    @RequestMapping(method=RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createUser(CreateContactRequest createContactRequest, ModelMap modelMap){
        try {
            contactServices.saveUser(new Contact(Integer.parseInt(createContactRequest.getUserId()), createContactRequest.getName(), createContactRequest.getPhone(), createContactRequest.getEmail(), createContactRequest.getMessage()));
        }
        catch (Exception e){
            if(e.getClass()==InvalidDataAccessApiUsageException.class)
            modelMap.addAttribute("message","Please Enter Correct User Id");
            else
            modelMap.addAttribute("message",e.getMessage());
            return "error-page";
        }
        return "contact-add";
    }
}
