package com.rockcor.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base{
	
	private final static By LOCATOR_HOME = By.linkText("Home");
	private final static By LOCATOR_LOGIN_USER = By.name("userName");
	private final static By LOCATOR_LOGIN_PASSWORD = By.name("password");
	private final static By LOCATOR_LOGIN_BTN = By.name("submit");
	
	private final static String USERNAME = "qualityAdmin123!=";
	private final static String PASSWORD = "qualityAdmin123!=";
	

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	

}
