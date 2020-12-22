/**
 * 
 */
package com.rockcor.selenium;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	private final static By LOCATOR_REGISTER_MESSAGE_SUCCESS = By.tagName("font");
	
	private final static By LOCATOR_HOME = By.linkText("Home");
	private final static By LOCATOR_LOGIN_USER = By.name("userName");
	private final static By LOCATOR_LOGIN_PASSWORD = By.name("password");
	private final static By LOCATOR_LOGIN_BTN = By.name("submit");
	
	private final static String USERNAME = "qualityAdmin123!=";
	private final static String PASSWORD = "qualityAdmin123!=";
	

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registeredUser() throws InterruptedException {
		click(LOCATOR_REGISTER_LINK);
		sleep(2000);
		
		if(isDisplayed(LOCATOR_REGISTER_PAGE_FOUND)) {
			sendKeys(USERNAME, LOCATOR_REGISTER_EMAIL);
			sendKeys(PASSWORD, LOCATOR_REGISTER_PASS);
			sendKeys(PASSWORD, LOCATOR_REGISTER_PASS);
			click(LOCATOR_REGISTER_SUBMIT_BTN);
			
			List<WebElement> fonts = findElements(LOCATOR_REGISTER_MESSAGE_SUCCESS);
			
			String resultS = "Note: Your user name is " + USERNAME + ".";
			
			for (WebElement webElement : fonts) {
				System.out.println(fonts.indexOf(webElement) + " - " + webElement.getText());
			}
			
			assertEquals(resultS, fonts.get(5).getText());

		}
		else {
			System.out.print("Register page was not found");
		}
		
	}
	
	public boolean success() {
		return true;
	}

}
