package Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//london
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//switch to another frame
        driver.switchTo().frame("content");//by switching code switch to frame by name
		WebElement header=driver.findElement(By.tagName("h1"));
		System.out.println(header.getText());
		
		
		driver.switchTo().defaultContent();//return to main page then go to another frame 
		WebElement frame=driver.findElement(By.xpath("//frame[@name=\"navbar\"]")); //switch to by webElement
		driver.switchTo().frame(frame);
		WebElement noframe=driver.findElement(By.xpath("//a[@target=\"_top\" and @href=\"home.html\"]"));
		System.out.println(noframe.getText());
		
		
		driver.quit();
	}

}
