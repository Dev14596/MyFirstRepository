package WebElementExample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepickerdropdown
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*String month="May";
		String Year="2018";
		String Date="18";*/
		
		System.setProperty("webdriver.chrome.driver",".\\Resorces\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
		/*
		while(true) {
			
			String P=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
			String []D=P.split(" ");
			String mon=D[0];
			String yer=D[1];
			
			if(mon.equalsIgnoreCase(month)  && yer.equalsIgnoreCase(Year)) {
				break;	
			}else {
				driver.findElement(By.xpath("//button[normalize-space()='Previous Month']")).click();
			}
			
			//Date selection
			List<WebElement> alldates=driver.findElements(By.xpath("//div[@role='listbox']/div/div"));  //problem this line date not selected
			for(WebElement i:alldates) {
				String dt=i.getText();
				
				if(dt.equals(Date)) {
					i.click();
					break;
				}
			}*/
		//selection for month
		Select monthdrop=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		monthdrop.selectByVisibleText("May");
		
		//selection for year
		//select[@class='react-datepicker__year-select']
		Select yeardrop=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		yeardrop.selectByVisibleText("1996");
		
		//Selection for date
		String date="14";
		List<WebElement> alldates=driver.findElements(By.xpath("//div[@role='listbox']//div"));
		for(WebElement D:alldates) {
			String dt=D.getText();
			
			if(dt.equals(date)) {
				D.click();
				break;
			}
		}
		
	
	}
		
	}




