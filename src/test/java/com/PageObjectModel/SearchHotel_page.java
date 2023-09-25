package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.BaseClass.base;

public class SearchHotel_page extends base {
	
	public SearchHotel_page() {
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement  RoomType   ;
	
	@FindBy(id="room_nos")
	private WebElement NumberofRooms;
	
	@FindBy(id="datepick_in")
	private WebElement Checkindate;
	
	@FindBy(id="datepick_out")
	private WebElement Checkoutdate;
	
	@FindBy(id="adult_room")
	private WebElement AdultsperRoom;
	
	
	@FindBy(id="child_room")
	private WebElement ChildrensperRoom;
	
	
	@FindBy(id="Submit")
	private WebElement Searchbtn;
	
	public WebElement getSearchbtn() {
		return Searchbtn;
	}
	
	public WebElement getLocation() {
		return Location;
	}


	public WebElement getHotels() {
		return Hotels;
	}


	public WebElement getRoomType() {
		return RoomType;
	}


	public WebElement getNumberofRooms() {
		return NumberofRooms;
	}


	public WebElement getCheckindate() {
		return Checkindate;
	}


	public WebElement getCheckoutdate() {
		return Checkoutdate;
	}


	public WebElement getAdultsperRoom() {
		return AdultsperRoom;
	}


	public WebElement getChildrensperRoom() {
		return ChildrensperRoom;
	}

	


	public void SelectHotel(String Location, String Hotels, String RoomType, String NumberofRooms, String Checkindate, String Checkoutdate, String AdultsperRoom, String ChildrensperRoom) {
		selectValue(getLocation(), Location);
		selectValue(getHotels(), Hotels);
		selectValue(getRoomType(), RoomType);
		selectValue(getNumberofRooms(),NumberofRooms);
		entertext(getCheckindate(), Checkindate);
		entertext(getCheckoutdate(), Checkoutdate);
		selectValue(getAdultsperRoom(), AdultsperRoom);
		selectValue(getChildrensperRoom(), ChildrensperRoom);
		click(getSearchbtn());	
		
		}
	

}



