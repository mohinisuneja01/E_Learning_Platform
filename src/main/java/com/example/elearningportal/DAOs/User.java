package com.example.elearningportal.DAOs;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @Column(name = "USER_ID")
    private int userId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "REG_DATE")
    private Date regDate;
    @Column(name = "UPLOAD_PHOTO")
    private String uploadPhoto;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Contact> contact;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;
    public User() {
    }

    public User(int userId) {
        this.userId = userId;
    }

    public User(String name, String address, Date regDate, String uploadPhoto, String phone, String email, String password) {
        this.name = name;
        this.address = address;
        this.regDate = regDate;
        this.uploadPhoto = uploadPhoto;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getUploadPhoto() {
        return uploadPhoto;
    }

    public void setUploadPhoto(String uploadPhoto) {
        this.uploadPhoto = uploadPhoto;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", regDate=" + regDate +
                ", uploadPhoto='" + uploadPhoto + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contact=" + contact +
                ", feedbacks=" + feedbacks +
                '}';
    }
}
