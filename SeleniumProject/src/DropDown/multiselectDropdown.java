package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiselectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");//demoQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		Thread.sleep(5000);//for wait manual scroll down becouse advertise is show
		
		driver.findElement(By.xpath("//div[@id='selectMenuContainer']//div[@class=\"row\"]/div/div/div/div")).click();
		
		
		
		
		
		
		
		
		
		//div[@id='selectMenuContainer']//div[@class="row"]/div/div/div/div/span
	}

}
