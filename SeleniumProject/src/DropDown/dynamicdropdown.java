package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");//demoQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id=\"withOptGroup\"]//div[contains(@class,\"-indicatorContainer\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='react-select-2-option-0-1']")).click();
		
		
	}

}
