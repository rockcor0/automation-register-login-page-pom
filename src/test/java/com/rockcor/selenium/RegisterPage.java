/**
 * 
 */
package com.rockcor.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author ricardodelgadocarreno
 *
 */
public class RegisterPage extends Base{
	
	private final static String URL = "http://demo.guru99.com/test/newtours/";
	private final static By LOCATOR_REGISTER_LINK = By.linkText("REGISTER");
	private final static By LOCATOR_REGISTER_XPATH = By.xpath("//a[@data-target='#modalUserLogin']");
	private final static By LOCATOR_CLOSE_ADD = By.xpath("//div[@id='closeBtn']");
	private final static By LOCATOR_REGISTER_PAGE_FOUND = By.xpath("//img[@src='images/mast_register.gif']");
	private final static By LOCATOR_REGISTER_EMAIL = By.id("email");
	private final static By LOCATOR_REGISTER_PASS = By.name("password");
	private final static By LOCATOR_REGISTER_PASS_CONF = By.cssSelector("input[name='confirmPassword']");
	private final static By LOCATOR_REGISTER_SUBMIT_BTN = By.name("submit");
	
	private final static By LOCATOR_HOME = By.linkText("Home");
	private final static By LOCATOR_LOGIN_USER = By.name("userName");
	private final static By LOCATOR_LOGIN_PASSWORD = By.name("password");
	private final static By LOCATOR_LOGIN_BTN = By.name("submit");
	
	private final static String USERNAME = "qualityAdmin123!=";
	private final static String PASSWORD = "qualityAdmin123!=";
	
	private WebDriver driver;


	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registeredUser() {
		
	}
	
	public boolean success() {
		return true;
	}

}
