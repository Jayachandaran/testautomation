package com.demo.pageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;

public class Login {
	
	public static WebDriver driver;
	
	public static void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
		}

	public static void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		}

	public static void user_enters_UserName_and_Password(DataTable userCredentials) throws Throwable {
		List<List<String>> userData = userCredentials.raw();
		driver.findElement(By.id("log")).sendKeys(userData.get(0).get(0)); 
	    driver.findElement(By.id("pwd")).sendKeys(userData.get(0).get(1));
		driver.findElement(By.id("login")).click();
		}

	public static void message_displayed_Login_Successfully() throws Throwable {
		//System.out.println(driver.findElement(By.id("//*[@id=\"post-31\"]/header/h1")).getText());
		System.out.println("Login Successfully");
	}

	public static void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}

	public static void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
	}

	public static void closeTheBrowser() throws Throwable {
		driver.close();
		driver.quit();
		
	}

}
