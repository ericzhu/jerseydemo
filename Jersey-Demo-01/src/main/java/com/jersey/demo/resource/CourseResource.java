package com.jersey.demo.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.demo.model.Course;
import com.jersey.demo.repository.CourseRepository;
import com.jersey.demo.repository.CourseRepositoryStub;

@Path("courses")
public class CourseResource {
	CourseRepository courseRepository = new CourseRepositoryStub();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> getCourses() {
		return courseRepository.findAllCourses();
	}
}
