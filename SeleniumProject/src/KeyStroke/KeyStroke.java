package KeyStroke;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import WebElementExample.Webelement;
import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;

public class KeyStroke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");   //orangeHRM
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		//Approach 1	
		WebElement usertext= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		usertext.sendKeys("Admin");
		WebElement Passtext=driver.findElement(By.xpath("//input[@id='txtPassword']"));
    	//	Passtext.sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@id='btnLogin']")).sendKeys(Keys.ENTER);
		
		//Approach 2
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform(); //select All text
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); //copy text
		//usertext.click();
		Passtext.click();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//Approach 3
		
		String select=Keys.chord(Keys.CONTROL,"a");
		String copy=Keys.chord(Keys.CONTROL,"c");
		String paste=Keys.chord(Keys.CONTROL,"v");
		
		usertext.sendKeys(select);
		usertext.sendKeys(copy);
		Passtext.click();
		Passtext.sendKeys(paste);
		
		
		
		
		
		
	}

}
