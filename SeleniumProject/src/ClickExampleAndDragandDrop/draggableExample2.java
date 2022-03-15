package ClickExampleAndDragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draggableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");//ToolQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']")).click();
		Actions draganddrop=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='acceptable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
		draganddrop.dragAndDrop(source, target).perform();
	}

}
