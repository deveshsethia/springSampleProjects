package com.rest;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.rest.ActivityRepository.*;
import com.rest.model.Activity;
@Path("activities")
public class AcivityResource {

	private ActivityRepository activityrepository = new AcitvityRepositoryStub();
    @POST
    @Produces(MediaType.APPLICATION_JSON_TYPE)
    @Consumes(MediaType.APPLICATION_JSON_TYPE)
    public Activity createActivityParams(Activity activity ) {
		
    	System.out.println(activity.getActivityId());
    	System.out.println(activity.getDestination());
    	System.out.println(activity.getDuration());
    	activityrepository.createActivity(activity);
    	return activity;
    	
    }
	
	
	@GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Activity> getAllActivities(){
		return activityrepository.findAllActivities();
    	
    }
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("{activityId}")
    public Activity getActivity(@PathParam("activityId") String activityId) {
    	activityrepository.findAllActivities();
		return activityrepository.findAcivity("00001");
    	
    }


	
	
	
} 