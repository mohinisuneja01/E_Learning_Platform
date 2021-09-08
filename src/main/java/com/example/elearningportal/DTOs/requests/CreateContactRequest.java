package com.example.elearningportal.DTOs.requests;

public class CreateContactRequest {
    private String userId;
    private String name;
    private String phone;
    private String email;
    private String message;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateContactRequest(String userId, String name, String phone, String email, String message) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.message = message;
    }

    public CreateContactRequest() {
    }
}
