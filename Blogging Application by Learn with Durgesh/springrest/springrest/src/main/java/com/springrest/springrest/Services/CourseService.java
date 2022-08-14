package com.springrest.springrest.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.Entities.Course;


public interface CourseService {

	 public List<Course> getCourses();
	 
	 
	 //here we have changed return type of course as long, it was String earlier.
	 public Course getCourse(long courseId); 
	 
	 //Adding new course here
	 public Course addCourse(Course course);
}

