package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement Name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		Name.sendKeys("Devendra");
		System.out.println(Name.getText());
		System.out.println(Name.getTagName());	
		
		WebElement Mobilenumber=driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		Mobilenumber.sendKeys("6211220155");
		System.out.println(Mobilenumber.getText());
		System.out.println(Mobilenumber.getTagName());
		
		WebElement Emailid=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Emailid.sendKeys("google@gmail.com");
		System.out.println(Emailid.getText());
		System.out.println(Emailid.getTagName());
		
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456789");
		System.out.println(password.getText());
		System.out.println(password.getTagName());
		
		WebElement Address=driver.findElement(By.xpath("//*[@id=\"address\"]"));
		Address.sendKeys("At post Amode Tal-Yawal Dist-Jalgaon.");
		System.out.println(Address.getText());
		System.out.println(Address.getTagName());
		
		WebElement Submit=driver.findElement(By.xpath("//button[@type=\"submit\" and @class=\"btn btn-primary\"]"));
		Submit.click();
		System.out.println(Submit.getText());
		System.out.println(Submit.getTagName());
		
		
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"male\"]"));
		radiobutton.click();
		System.out.println(radiobutton.getText());
		System.out.println(radiobutton.getTagName());
		
		
		WebElement Checkbox=driver.findElement(By.xpath("//*[@id=\"monday\"]"));
		Checkbox.click();
		System.out.println(Checkbox.getText());
		System.out.println(Checkbox.getTagName());
		
	}

}
