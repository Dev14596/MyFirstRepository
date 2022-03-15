package ClickExampleAndDragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toolTipExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");//demoQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//button[@id='toolTipButton']"))).perform();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText());
	}

}
