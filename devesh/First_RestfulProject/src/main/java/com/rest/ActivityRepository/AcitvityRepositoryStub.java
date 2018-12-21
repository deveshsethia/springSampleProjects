package com.rest.ActivityRepository;
import java.util.ArrayList;

import java.util.List;
import com.rest.model.*;
public class AcitvityRepositoryStub implements ActivityRepository {

	List<Activity> activities = new ArrayList<>();

	@Override
	public List<Activity> findAllActivities() {
		Activity activity1= new Activity();
		activity1.setDestination("running");
		activity1.setDuration(30);
		activity1.setActivityId("00001");
		activities.add(activity1);
		Activity activity2= new Activity();
		activity2.setDestination("badminton");
		activity2.setDuration(40);
		activity2.setActivityId("00002");
		activities.add(activity2);
		Activity activity3= new Activity();
		activity3.setDestination("gym");
		activity3.setDuration(60);
		activity3.setActivityId("00003");
		activities.add(activity3);
		return activities;
		
	}

	@Override
	public Activity findAcivity(String activityId) {
      for(int i=0;i<activities.size();i++) {
    	  if(activities.get(i).getActivityId()==activityId) {
    		  return activities.get(i);
    	  }
      }

		return null;
	}

	@Override
	public void createActivity(Activity activity) {

     activities.add(activity);
		
	}
	



}
