package ClickExampleAndDragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropusingXandYaxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");//ToolQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='dragBox']"));
		action.moveToElement(source).dragAndDropBy(source, 200, 200).build().perform();
	}

}
