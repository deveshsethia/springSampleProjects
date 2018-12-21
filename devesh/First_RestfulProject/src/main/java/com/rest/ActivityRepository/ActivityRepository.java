package com.rest.ActivityRepository;

import java.util.List;

import com.rest.model.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivities();
    Activity findAcivity(String activityId);
    void createActivity(Activity activity);

}