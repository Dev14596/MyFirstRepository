package ClickExampleAndDragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick_Rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");//demoQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		Actions obj=new Actions(driver);
		obj.doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).perform();//Perform is mandatory ---->For Double click
		
		Thread.sleep(1000);//for time to wait perform second operation
		
		obj.contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).perform();   //For Right click
		
		Thread.sleep(2000);//for time to wait
		
		driver.quit();
		
	}

}
