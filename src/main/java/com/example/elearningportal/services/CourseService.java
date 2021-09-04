package com.example.elearningportal.services;

import com.example.elearningportal.DAOs.Course;
import com.example.elearningportal.DAOs.User;
import com.example.elearningportal.repository.CourseRepository;
import com.example.elearningportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public void saveUser(Course course){

        courseRepository.save(course);
    }
}
