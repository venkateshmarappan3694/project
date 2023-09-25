package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.base;

import io.cucumber.java.Before;

public class hooks extends base {
	@Before
	public void lanch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.get("https://adactinhotelapp.com/");
		
	}

	
}
