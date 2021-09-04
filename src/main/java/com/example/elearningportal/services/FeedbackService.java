package com.example.elearningportal.services;

import com.example.elearningportal.DAOs.Feedback;
import com.example.elearningportal.DAOs.User;
import com.example.elearningportal.repository.FeedbackRepository;
import com.example.elearningportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class FeedbackService {
    @Autowired
    FeedbackRepository feedbackRepository;

    public void saveUser(Feedback feedback){

        feedbackRepository.save(feedback);
    }
}
