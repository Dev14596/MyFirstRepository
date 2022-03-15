package Switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		/*//1.click ok button
		WebElement clickbutton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickbutton.click();
		
		//we have to move alert
		Alert obj=driver.switchTo().alert();
		
		obj.accept();*/
		
		/*//2.click ok button 5 sec.
		WebElement clickbutton=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickbutton.click();
		
		//we have to move alert
		Alert obj1=driver.switchTo().alert();
		Thread.sleep(5000);
		
		obj1.accept();*/
		
		//3.cancle button
	/*	WebElement clickbuttoncancle=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickbuttoncancle.click();
		
		//we have to move alert
		Alert obj2=driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(obj1.getText());
		obj2.dismiss();*/
	
		WebElement textbutton=driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		 textbutton.click();
		
		//we have to move alert
		Alert obj3=driver.switchTo().alert();
		Thread.sleep(5000);
		obj3.sendKeys("hi i am dev");
	
		System.out.println(obj3.getText());
		obj3.accept();
		
		
		
		
	}

}
