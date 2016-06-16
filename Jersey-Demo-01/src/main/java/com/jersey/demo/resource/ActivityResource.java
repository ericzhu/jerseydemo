package com.jersey.demo.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.demo.model.Activity;
import com.jersey.demo.repository.ActivityRepository;
import com.jersey.demo.repository.ActivityRepositoryStub;

@Path("activities")
public class ActivityResource {

	private ActivityRepository activityRepository = new ActivityRepositoryStub();

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Activity> getActivities() {
		return activityRepository.findAllActivities();
	}

}
