package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For Chrome Browser latest version is 98
				System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
				ChromeDriver obj = new ChromeDriver();
				obj.get("https://demoqa.com/text-box");
				System.out.println(obj.getTitle());
				obj.manage().window().maximize();
				//Enter the address and perform the operation
				//enter the value in find element field
				//address of element is called as locator
				//different way of finding the locator----8
				WebElement Fullname=obj.findElement(By.xpath("//input[@id='userName']"));
				Fullname.sendKeys("Devendra");
				
				WebElement Email=obj.findElement(By.xpath("//input[@id='userEmail']"));
				Email.sendKeys("google@gmail.com");
				
				WebElement Currentaddress=obj.findElement(By.xpath("//textarea[@id='currentAddress']"));
				Currentaddress.sendKeys("At post-Amode Tal-yawal Dist-Jalgaon");
					
				Fullname.clear();// it will delete the value in line no 22
				Fullname.sendKeys("devendra Bhanudas patil");
				
				WebElement submit=obj.findElement(By.xpath("//button[@id='submit']"));
				submit.click();
				
				
			
	}

}
