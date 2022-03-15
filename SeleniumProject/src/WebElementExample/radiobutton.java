package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		     WebElement yes=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")); //Because radio button id not selected
		     yes.click();
		     System.out.println(yes.getText());
		     
		     WebElement immpressive=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")); //Because radio button id not selected
		     immpressive.click();
		    System.out.println(immpressive.getText());
		    
		    
			
		
	}

}
