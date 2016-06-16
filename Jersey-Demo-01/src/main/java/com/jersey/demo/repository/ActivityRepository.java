package com.jersey.demo.repository;

import java.util.List;

import com.jersey.demo.model.Activity;

public interface ActivityRepository {

	public abstract List<Activity> findAllActivities();

}