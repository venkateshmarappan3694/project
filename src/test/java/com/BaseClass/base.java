package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class base {
	public static WebDriver driver=null;
	
	public void entertext(WebElement Element,String text) {
		Element.click();
		Element.clear();
		Element.sendKeys(text);

	}
	
	public void click(WebElement Element) {
		Element.click();

	}
	
	public void selectVisible(WebElement Element,String text) {
		
		Select select=new Select(Element);
		select.selectByVisibleText(text);
		
	}
	
	public void selectIndex(WebElement Element,int number) {
		Select select=new Select(Element);
		select.selectByIndex(number);
		
	}
	
	public void selectValue(WebElement Element,String text) {
		Select select=new Select(Element);
		select.selectByValue(text);
		
	}
	

}
