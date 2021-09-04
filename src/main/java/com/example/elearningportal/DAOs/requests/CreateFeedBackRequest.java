package com.example.elearningportal.DAOs.requests;

import com.example.elearningportal.DAOs.User;

public class CreateFeedBackRequest {
    private String name;
    private String feedback;
    private String email;
    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CreateFeedBackRequest(String name, String feedback, String email, String userId) {
        this.name = name;
        this.feedback = feedback;
        this.email = email;
        this.userId = userId;
    }

    public CreateFeedBackRequest() {
    }
}
