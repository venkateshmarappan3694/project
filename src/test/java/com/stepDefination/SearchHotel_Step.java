																																																																																																																																												package com.stepDefination;

import com.PageObjectManager.pageobjectmanager;

import io.cucumber.java.en.Then;

public class SearchHotel_Step {
	
	pageobjectmanager pom=new pageobjectmanager();
	
	
	
	@Then("user should search the hotel following the depends {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_search_the_hotel_following_the_depends(String Location, String Hotels, String RoomType, String NumberofRooms, String Checkindate, String Checkoutdate, String AdultsperRoom, String ChildrensperRoom) {
    pom.getSearchHotel().SelectHotel(Location, Hotels, RoomType, NumberofRooms, Checkindate, Checkoutdate, AdultsperRoom, ChildrensperRoom);
	}




}
