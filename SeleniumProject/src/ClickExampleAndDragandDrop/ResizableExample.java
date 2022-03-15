package ClickExampleAndDragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/resizable");//ToolQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		Actions resizeaction=new Actions(driver);
		//WebElement resize=driver.findElement(By.xpath("//div[@id=\"resizableBoxWithRestriction\"]/span"));//element no 1.
		WebElement resize1=driver.findElement(By.xpath("//div[@id=\"resizable\"]/span"));//element no.2
		System.out.println(resize1.getLocation().getX());
		System.out.println(resize1.getLocation().getY());
		Thread.sleep(2000);//thise code is stop execution 2000 mili sec because due to advertise override in element manually scroll down the page.22
		resizeaction.clickAndHold(resize1).moveByOffset(400, 100).release().build().perform();
	}

}
