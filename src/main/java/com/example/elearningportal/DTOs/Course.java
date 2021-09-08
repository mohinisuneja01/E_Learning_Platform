package com.example.elearningportal.DTOs;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "COURSE")
public class Course {
    @Id
    @GeneratedValue
    @Column(name = "COURSE_ID")
    private int courseId;
    @Column(name = "COURSE_NAME")
    private String course_name;
    @Column(name = "COURSE_RESOURCE")
    private String course_resource;
    @Column(name = "COURSE_DESC")
    private String course_desc;
    @Column(name = "COURSE_FEE")
    private String course_fee;
    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;

    public Course(int courseId) {
        this.courseId = courseId;
    }

    public Course() {
    }

    public Course(String course_name, String course_resource, String course_desc, String course_fee) {
        this.course_name = course_name;
        this.course_resource = course_resource;
        this.course_desc = course_desc;
        this.course_fee = course_fee;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_resource() {
        return course_resource;
    }

    public void setCourse_resource(String course_resource) {
        this.course_resource = course_resource;
    }

    public String getCourse_desc() {
        return course_desc;
    }

    public void setCourse_desc(String course_desc) {
        this.course_desc = course_desc;
    }

    public String getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(String course_fee) {
        this.course_fee = course_fee;
    }
}
