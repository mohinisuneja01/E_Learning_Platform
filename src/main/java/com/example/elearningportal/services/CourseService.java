package com.example.elearningportal.services;

import com.example.elearningportal.DTOs.Course;
import com.example.elearningportal.DAOs.CourseRepository;
import com.example.elearningportal.DAOs.EnrollmentRepository;
import com.example.elearningportal.DTOs.Enrollment;
import com.example.elearningportal.DTOs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    EnrollmentRepository enrollmentRepository;

    public void saveUser(Course course){

        courseRepository.save(course);
    }
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public void enrollUser(int userId,int courseId){
    enrollmentRepository.save(new Enrollment(Date.valueOf(LocalDate.now()),userId,courseId));
    }
    public List<Enrollment> getEnrolledCourses(int userId){
        return enrollmentRepository.findByUser(new User(userId));
    }
}