package ClickExampleAndDragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderBarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider");//ToolQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		Actions slideraction=new Actions(driver);
		WebElement slide=driver.findElement(By.xpath("//input[@type=\"range\"]"));
		System.out.println(slide.getLocation().getX());
		slideraction.clickAndHold(slide).moveByOffset(60,0).release().build().perform();

	}

}
