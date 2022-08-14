package com.springrest.springrest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Entities.Course;
import com.springrest.springrest.Services.CourseService;

@RestController
public class MyController {
	
	@GetMapping("/home")
public String Home()
{
	return "Welcome to Courses Application";
}
	@Autowired
	private CourseService courseService;
	
	//Get Courses- This method will return the list of courses.
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
	 	return this.courseService.getCourses();
	}
	
	
	//Get Course- This method will return course of particular id
	@GetMapping("/courses/{courseId}")
	 public Course getCourse(@PathVariable String courseId)
	 {
		//here return type of String is converted into Long using parseLong
		 return this.courseService.getCourse(Long.parseLong(courseId));
	 }
	
	@PostMapping("/courses") 
	public Course addCourse(@RequestBody Course course)
		{
		return this.courseService.addCourse(course);
	
	}
}
