package com.example.elearningportal.controllers;

import com.example.elearningportal.DAOs.Course;
import com.example.elearningportal.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(method = RequestMethod.GET)
    public String getCourseRegistration(){
        return "course-registration";
    }
    @RequestMapping(method=RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createCourse(Course course){
        courseService.saveUser(course);
        return "course-registration";
    }
}
