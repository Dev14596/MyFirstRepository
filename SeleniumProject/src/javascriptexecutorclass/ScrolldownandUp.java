package javascriptexecutorclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;

public class ScrolldownandUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//Enter the address and perform the operation
		//enter the value in find element field
		//address of element is called as locator
		//different way of finding the locator----8
		WebElement Fullname=driver.findElement(By.xpath("//input[@id='userName']"));
		Fullname.sendKeys("Devendra");
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("google@gmail.com");
		
		WebElement Currentaddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		Currentaddress.sendKeys("At post-Amode Tal-yawal Dist-Jalgaon");
			
		Fullname.clear();// it will delete the value in line no 22
		Fullname.sendKeys("devendra Bhanudas patil");
		
		
		//approach-1
		JavascriptExecutor javascript=(JavascriptExecutor) driver;
		//javascript.executeScript("window.scrollBy(0,100)");
		
		//Approach-2
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		//javascript.executeScript("arguments[0].scrollIntoView();",submit);
		
		
		//Approach 3
		javascript.executeScript("window.scrollTo(0,document.body.scrolleight)");
		
		///WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		
		
		
	}

}
