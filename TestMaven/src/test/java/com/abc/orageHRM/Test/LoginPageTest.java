package com.abc.orageHRM.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abc.commonfunctionality.BrowserLaunch;
import com.abc.OrangeHRMS.Pages.Dashboard;
import com.abc.OrangeHRMS.Pages.LoginPage;

public class LoginPageTest extends BrowserLaunch {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Login with valid credential 
		BrowserLaunch browser=new BrowserLaunch();
		browser.Browser_Initilisation();
		LoginPageTest logintest=new LoginPageTest();
		logintest.Login_InSuccessfully("admin", "admin");
		logintest.Login_Successfully("Admin", "admin123");
		
	}
	
	
	public void Login_Successfully(String username,String password) throws InterruptedException {
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsernametxt().sendKeys(username);
		loginpage.getPasswordtxt().sendKeys(password);
		loginpage.getLoginBtn().click();
		//Thread.sleep(1000);
		Dashboard dashboardpage=new Dashboard(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(new ExpectedCondition<Boolean>(){

			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.tagName("h1")).isDisplayed();
			}
			
		});
		if(dashboardpage.getDashboardLabel().isDisplayed()) {
			 System.out.println("User is able to login successfully"); }
		else {
			 System.out.println("User is not able to login successfully"); 
			 }
		
	}
	
	public void Login_InSuccessfully(String username,String password) throws InterruptedException {
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsernametxt().sendKeys(username);
		loginpage.getPasswordtxt().sendKeys(password);
		loginpage.getLoginBtn().click();
		Thread.sleep(1000);
		if(loginpage.getinvalidMessageLabel().isDisplayed())
		{
			System.out.println("User is not able to login with invalid credential");
		}
		else {
			System.out.println("User is able to login with invalid credential");
		}
		
	}
}
