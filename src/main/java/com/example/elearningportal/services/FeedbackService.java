package com.example.elearningportal.services;

import com.example.elearningportal.DTOs.Feedback;
import com.example.elearningportal.DAOs.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
    @Autowired
    FeedbackRepository feedbackRepository;

    public void saveUser(Feedback feedback){

        feedbackRepository.save(feedback);
    }
}
