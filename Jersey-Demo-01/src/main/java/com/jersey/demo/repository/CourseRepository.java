package com.jersey.demo.repository;

import java.util.List;

import com.jersey.demo.model.Course;

public interface CourseRepository {

	public abstract List<Course> findAllCourses();

}