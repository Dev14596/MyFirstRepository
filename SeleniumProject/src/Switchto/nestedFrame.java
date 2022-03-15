package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");//demoQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		
		//switch to another frame
        driver.switchTo().frame("frame1");//by switching code switch to frame by name
		WebElement Frame1=driver.findElement(By.xpath("//body[text()=\"Parent frame\"]")); //frame path
		System.out.println(Frame1.getText());
	
		WebElement frame=driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]")); //FRAME SWITCH BY WEBELEMENT
		driver.switchTo().frame(frame);
		WebElement frame2=driver.findElement(By.xpath("//body/p[text()=\"Child Iframe\"]")); ///frame path
		System.out.println(frame2.getText());
	}

}
