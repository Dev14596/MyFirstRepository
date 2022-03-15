package Switchto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	
		String parent=driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		
		
		WebElement clickbutton=driver.findElement(By.xpath("//button[@id='tabButton']"));
		clickbutton.click();
		
		
		Set<String> handler=driver.getWindowHandles();
		Iterator <String> itr=handler.iterator();
		while(itr.hasNext()) {
			String child=itr.next().toString();
			System.out.println(child);
			if(parent.equalsIgnoreCase(child)) {
				System.out.println("both are same");	
			}else {
				System.out.println("both are diff");
				driver.switchTo().window(child);
			}
		}
	}

}
