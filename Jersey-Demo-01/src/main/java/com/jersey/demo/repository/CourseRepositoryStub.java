package com.jersey.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.jersey.demo.model.Course;

public class CourseRepositoryStub implements CourseRepository {

	@Override
	public List<Course> findAllCourses() {
		List<Course> courses = new ArrayList<>();
		courses.add(new Course("Swimming", 30));
		courses.add(new Course("Cycling", 60));
		return courses;
	}
}
