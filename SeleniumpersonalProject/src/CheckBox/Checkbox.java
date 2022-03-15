package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//1)How to select specific check boxes
		
		driver.findElement(By.xpath("//input[@id=\"monday\"]")).click();//input[contains(@id,\"day\")]
		
		//2)how to select multiple check boxes
		
		List<WebElement> allcheckbox=driver.findElements(By.xpath("//input[contains(@id,\\\"day\\\")]"));
		System.out.println(allcheckbox.size());
	
		
		//for each loop
		for(WebElement a:allcheckbox) {
			
			a.click();
		}
		
		//Normal for loop
		
		for(int i=0;i<allcheckbox.size();i++) {
			allcheckbox.get(i).click();
		}
		
		//3)select multiple check boxes by choice "monday" and " sunday"
		
         for(WebElement a:allcheckbox) {
			String abc=a.getAttribute("id");
			if(abc.equalsIgnoreCase("monday") || abc.equalsIgnoreCase("sunday")){
				a.click();

			}
			a.click();
		}
         
		//4)select last three check boxes
         
         int totalcount=allcheckbox.size();
         for(int i=totalcount-2;i<totalcount;i++) {
        	 allcheckbox.get(i).click();
        	 
         }
         
		//5)select first 3 check box
         for(int i=0;i<totalcount;i++) {
        	 if(i<3) {
        	 allcheckbox.get(i).click();
        	 }
         }
         
		
	}

}
