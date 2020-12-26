package com.rockcor.selenium;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base{
	
	private final static By LOCATOR_HOME = By.linkText("Home");
	private final static By LOCATOR_LOGIN_USER = By.name("userName");
	private final static By LOCATOR_LOGIN_PASSWORD = By.name("password");
	private final static By LOCATOR_LOGIN_BTN = By.name("submit");
	private final static By LOCATOR_REGISTER_MESSAGE_SUCCESS = By.tagName("font");

	
	private final static String USERNAME = "qualityAdmin123!=";
	private final static String PASSWORD = "qualityAdmin123!=";
	
	public final static String SING_IN_MESSAGE = "Thank you for Loggin.";
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void loginUser() {
		
		if( isHomePageDisplayerd() ) {
			
		}
		
		click(LOCATOR_HOME);
		
		implicitlyWait(1000);
		
		sendKeys(USERNAME, LOCATOR_LOGIN_USER);
		sendKeys(PASSWORD, LOCATOR_LOGIN_PASSWORD);
		click(LOCATOR_LOGIN_BTN);
		
		implicitlyWait(1000);
		
		List<WebElement> fonts = findElements(LOCATOR_REGISTER_MESSAGE_SUCCESS);
		
		for(WebElement item : fonts) {
			System.out.println(fonts.indexOf(item) + " - " + item);
		}
		
		String result = "Thank you for Loggin.";
		
		assertEquals(fonts.get(3).getText(), result);
	}
	
	public boolean isHomePageDisplayerd() {
		return true;
	}
	
	public String signInMessage() {
		
List<WebElement> fonts = findElements(LOCATOR_REGISTER_MESSAGE_SUCCESS);
		
		for(WebElement item : fonts) {
			System.out.println(fonts.indexOf(item) + " - " + item);
		}
		
		//String result = "Thank you for Loggin.";
		//assertEquals(fonts.get(3).getText(), result);
		
		return getText(fonts.get(3));
		
	}

}
