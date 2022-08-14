package com.springrest.springrest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.Entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
 	
	public CourseServiceImpl() {
	list= new ArrayList<>();
	list.add(new Course(154,"Java Core Course","this course contains basics of Java"));
	list.add(new Course (155,"Spring Boot", "Creaing rest api using Spring boot"));
	
	}


	@Override
	public List<Course> getCourses() {
		
		return list;
	}
	
	@Override
	public Course getCourse(long courseId)
	{
		Course c=null;
		for(Course course:list)
		if(course.getId()== courseId)
	{
			c=course;
			break;
			}
	return c;
	}


	@Override
	public Course addCourse(Course course) {
	
		//list is the container of the course list so we are adding new course objetc to it 
		list.add(course);
		return course;
	}
	
	

}
