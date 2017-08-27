package com.demo.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

	protected WebDriver driver;

	public PageObject(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver","C:\\testautomation\\AutomationDemo\\src\\main\\java\\com\\demo\\bdd\\driver\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}

}
