package com.stepDefination;

import com.PageObjectModel.Login_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_Step {
	
	Login_page log=new Login_page();
	


	
   

@When("user click login")
public void user_click_login() {
    System.out.println("ok");
}


@Given("user should perform login with {string} and {string}")
public void user_should_perform_login_with_and(String username , String password) {
	log.login(username, password);
}
}