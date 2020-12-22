package com.rockcor.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aisla el código de los comandos de Selenium Web Driver
 * @author ricardodelgadocarreno
 */
public class Base implements WebDriver{
	
	// SeleniumWrapper
	// UtilityClass
	
	//Page object model con selenium web driver
	
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

	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		driver = new ChromeDriver();
		return driver;
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void sendKeys(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}

	public void get() {
		driver.get(URL);
	}
	
	public void get(String url) {
		driver.get(url);
	}
	

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	public TargetLocator switchTo() {
		return driver.switchTo();
	}

	public Navigation navigate() {
		return driver.navigate();
	}

	public Options manage() {
		return driver.manage();
	}

}
