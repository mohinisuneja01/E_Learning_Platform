package com.example.elearningportal.DTOs;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ENROLLMENT")
public class Enrollment {
    @Id
    @GeneratedValue
    @Column(name = "ENROLLMENT_ID")
    private int enrollmentId;

    @Column(name = "ENROLLMENT_DATE")
    private Date enrollmentDate;
    @ManyToOne
    @JoinColumn(name = "USER_ID",nullable = false,updatable = false)
     private User user;
    @ManyToOne
    @JoinColumn(name = "COURSE_ID",nullable = false,updatable = false)
    private Course course;

    public Enrollment(Date enrollmentDate,int userId, int courseId) {

        this.enrollmentDate = enrollmentDate;
        this.user = new User(userId);
        this.course = new Course(courseId);
    }

    public Enrollment() {
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
