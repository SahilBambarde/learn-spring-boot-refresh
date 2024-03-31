package com.example.learnspringboot;

import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retreiveAllCourses(){
        return List.of(
                new Course(1L, "Learn AWS", "Sahil"),
                new Course(2L,"Learn DevOps", "Sahil"),
                new Course(2L,"Learn Azure", "Sahil"),
                new Course(2L,"Learn GCP", "Sahil")
        );
    }
}
