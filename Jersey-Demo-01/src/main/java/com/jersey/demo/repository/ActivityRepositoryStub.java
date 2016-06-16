package com.jersey.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.jersey.demo.model.Activity;

public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<>();
		activities.add(new Activity("Swimming", 30));
		activities.add(new Activity("Cycling", 60));
		return activities;
	}
}
