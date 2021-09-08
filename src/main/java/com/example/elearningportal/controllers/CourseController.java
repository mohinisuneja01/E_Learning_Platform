package com.example.elearningportal.controllers;
import com.example.elearningportal.DTOs.Course;
import com.example.elearningportal.DTOs.Enrollment;
import com.example.elearningportal.DTOs.User;
import com.example.elearningportal.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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

    @RequestMapping("/all")
    public String getAllCourses(ModelMap modelMap, @AuthenticationPrincipal User user){
       List<Enrollment> enrollmentList = courseService.getEnrolledCourses(user.getUserId());
        modelMap.addAttribute("courses", courseService.getAllCourses());
        modelMap.addAttribute("enrollments",enrollmentList);
        modelMap.addAttribute("userId",user.getUserId());
        return "view-course";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/all",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String enroll(@RequestBody String courseId,@AuthenticationPrincipal User user,ModelMap modelMap){
        modelMap.addAttribute("courses", courseService.getAllCourses());
        courseService.enrollUser(user.getUserId(),Integer.parseInt(courseId.split("=")[1]));
        return "view-course";
    }
}
