package com.project.springboot.courses.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.courses.bean.Course;

@RestController
public class CourseController {

	
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"SpringBoot","Bakya"));
	}
}
