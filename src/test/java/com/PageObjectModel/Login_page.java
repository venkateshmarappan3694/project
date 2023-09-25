package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.base;

public class Login_page extends base {
	
	public Login_page() {
		PageFactory.initElements(driver,this );
		
	}

	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement clickbtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getClickbtn() {
		return clickbtn;
	}
	
	public void login(String username,String password) {
		entertext(getUser(), username);
		entertext(getPass(), password);
		click(getClickbtn());

	}
	
	
	
	
}
