package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://demoqa.com/checkbox");
		System.out.println(obj.getTitle());
		obj.manage().window().maximize();
		
		     WebElement homecheck=obj.findElement(By.xpath("//span[@text()=\"Home\"]"));
				homecheck.click();
				
	}

}
