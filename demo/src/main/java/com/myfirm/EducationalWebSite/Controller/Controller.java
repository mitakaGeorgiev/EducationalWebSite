package com.myfirm.EducationalWebSite.Controller;

import com.myfirm.EducationalWebSite.entity.Course;
import com.myfirm.EducationalWebSite.Repository.CourseRepository;
import com.myfirm.EducationalWebSite.Service.CourseService;
import com.myfirm.EducationalWebSite.Dto.CourseTextDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }


    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.findAll();
    }

    @PostMapping("/addCourse")
    public void addCourse(@RequestBody Course course) {
        courseService.add(course);
    }

    @PutMapping("/editCourseText")
    public void updateCourse(@RequestBody CourseTextDto ob) {
        courseService.update(ob);
    }

    @DeleteMapping("/deleteCourseById/{id}")
    public void deleteCourseById(@PathVariable int id) {
        courseService.DeleteById(id);
    }

}
