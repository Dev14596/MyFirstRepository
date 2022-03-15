package TAB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tabs");//demoQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//a[@id='demo-tab-origin']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-origin\"]")).getText());
		
	}

}
