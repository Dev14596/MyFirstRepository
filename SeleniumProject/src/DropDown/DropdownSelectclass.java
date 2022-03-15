package DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");//demoQA
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		
		WebElement selectelement=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
		Select color=new Select(selectelement);
		//color.selectByVisibleText("Purple");//select by name-----purpule
		//color.selectByIndex(5);//select by index-------Black
		color.selectByValue("8");//select by value attributes--------Indigo
		
		
		//Get all option
		List<WebElement> alloption=color.getOptions();
		Iterator<WebElement> itr=alloption.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		
		System.out.println(color.getFirstSelectedOption().getText());
		
	}
}
