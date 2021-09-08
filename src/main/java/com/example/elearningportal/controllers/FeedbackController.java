package com.example.elearningportal.controllers;

import com.example.elearningportal.DTOs.Feedback;
import com.example.elearningportal.DTOs.User;
import com.example.elearningportal.DTOs.requests.CreateFeedBackRequest;
import com.example.elearningportal.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;

    @RequestMapping(method = RequestMethod.GET)
    public String getFeeback(@AuthenticationPrincipal User user, ModelMap modelMap){
        modelMap.addAttribute("userId",user.getUserId());
        return "feedback-registration";
    }
    @RequestMapping(method=RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createFeedback(CreateFeedBackRequest createFeedBackRequest){
        feedbackService.saveUser(new Feedback(createFeedBackRequest.getName(),createFeedBackRequest.getFeedback(),createFeedBackRequest.getEmail(),Integer.parseInt(createFeedBackRequest.getUserId())));
        return "feedback-registration";
    }
}
