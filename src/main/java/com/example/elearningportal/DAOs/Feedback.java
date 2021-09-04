package com.example.elearningportal.DAOs;

import javax.persistence.*;

@Entity
@Table(name = "FEEDBACK")
public class Feedback {
    @Id
    @GeneratedValue
    @Column(name = "FEEDBACK_ID")
    private int feedbackId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "FEEDBACK")
    private String feedback;
    @Column(name = "EMAIL")
    private String email;
    @ManyToOne
    @JoinColumn(name = "USER_ID",updatable = false,nullable = false)
    private User user;

    public Feedback() {
    }

    public Feedback(String name, String feedback, String email, int user_id) {
        this.name = name;
        this.feedback = feedback;
        this.email = email;
        this.user = new User(user_id);
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
