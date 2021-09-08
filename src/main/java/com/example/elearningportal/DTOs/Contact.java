package com.example.elearningportal.DTOs;

import javax.persistence.*;

@Entity
@Table(name = "CONTACT")
public class Contact {
    @Id
    @GeneratedValue
    @Column(name = "CONTACT_ID")
    private int contactId;
    @ManyToOne
    @JoinColumn(name = "USER_ID",nullable = false,updatable = false)
    private User user;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "MESSAGE")
    private String message;

    public Contact(int user_id, String name, String phone, String email, String message) {
        this.user = new User(user_id);
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
}
