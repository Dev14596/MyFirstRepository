package WaitExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");//ToolQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//implicit wait----- it will wait 2 sec each and every element.
		
		//Approach 1	//Explicit wait
		System.out.println("Before click");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));//Explicit wait -----it will wait 2 sec only specific element and specific condition only.
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='enableAfter']")));
		driver.findElement(By.xpath("//button[@id='enableAfter']")).click();
		System.out.println("after click");
		
		//Approach 2  //Explicit wait using expected condition interface.
		System.out.println("Before click");
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait1.until(new ExpectedCondition <Boolean> () {   //expected condition is a interface.

			@Override
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//button[@id='enableAfter']")).isDisplayed();  //check it is true or false after move to next execution.
			}
			
		});
		
		System.out.println("after click");
		
	}

}
