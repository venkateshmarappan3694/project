package com.PageObjectManager;

import com.PageObjectModel.Login_page;
import com.PageObjectModel.SearchHotel_page;

public class pageobjectmanager {
	
	private Login_page login_page;
	
	private SearchHotel_page searchHotel_page;

	public Login_page getLogin_page() {
		return (login_page==null)?login_page=new Login_page() :login_page;
	}

	public SearchHotel_page getSearchHotel() {
		return (searchHotel_page==null)?searchHotel_page=new SearchHotel_page():searchHotel_page;
		
	}
	
	

}
