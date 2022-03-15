package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");//demoQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		
		
		Select multiselect=new Select(driver.findElement(By.xpath("//select[@id='cars']")));
		multiselect.selectByIndex(0);
		multiselect.selectByIndex(1);
		System.out.println(multiselect.isMultiple());

		
	     multiselect.getAllSelectedOptions();
	
	
	}

}
