package ClickExampleAndDragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");//ToolQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[@id='droppableExample-tab-preventPropogation']")).click();
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='dragBox']"));
		WebElement target=driver.findElement(By.xpath("//div[@id=\"notGreedyDropBox\"]/p"));
		action.dragAndDrop(source, target).perform();
		

	}

}
