package com.example.elearningportal.controllers;

import com.example.elearningportal.DAOs.Feedback;
import com.example.elearningportal.DAOs.User;
import com.example.elearningportal.DAOs.requests.CreateFeedBackRequest;
import com.example.elearningportal.services.FeedbackService;
import com.example.elearningportal.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;

    @RequestMapping(method = RequestMethod.GET)
    public String getFeeback(){
        return "feedback-registration";
    }
    @RequestMapping(method=RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createFeedback(CreateFeedBackRequest createFeedBackRequest){
        feedbackService.saveUser(new Feedback(createFeedBackRequest.getName(),createFeedBackRequest.getFeedback(),createFeedBackRequest.getEmail(),Integer.parseInt(createFeedBackRequest.getUserId())));
        return "feedback-registration";
    }
}
