package WebElementExample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//Find the total no of table column size
		List <WebElement> column=driver.findElements(By.xpath("//div[@class=\"rt-tr-group\"]"));
		System.out.println("Total no of table column size : " + column.size());
		
		//Find the total no of table row size
		List <WebElement> row=driver.findElements(By.xpath("//div[@role=\"columnheader\"]"));
		System.out.println("Total no of table Row size : " + row.size());
		
		//Display all the row header name one by one. 
		List <WebElement> headername=driver.findElements(By.xpath("//div[@role=\"columnheader\"]"));
		Iterator <WebElement> itr=headername.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		

		/*//ALL data retrieve
		List<WebElement> alldata=driver.findElements(By.xpath("//div[@role=\"gridcell\"]"));
		Iterator <WebElement> itr2=alldata.iterator();
		while(itr2.hasNext()) {
		System.out.println(itr2.next().getText());
		}*/

		//display all data in last name gentry 
		System.out.println();
		
		WebElement lastname1=driver.findElement(By.xpath("//div[@class=\"rt-tbody\"]/div[3]/div"));
		System.out.println(lastname1.getText());
		
		
		System.out.println();
		//Find 10000 salary if row and column not given
		        String Salary="10000";//10000 is give 
		
				List<WebElement> alldata=driver.findElements(By.xpath("//div[@role=\"gridcell\"]"));//all data retrieve
				Iterator <WebElement> itr2=alldata.iterator();
				while(itr2.hasNext()) {
				String data=itr2.next().getText();
				if(Salary.equalsIgnoreCase(data)) {   //compare to given string
					WebElement obj=driver.findElement(By.xpath("//div[@id=\"app\"]//div[2]/div[3]/div[1]/div[2]/div[1]"));  //path of 10000
					System.out.println(obj.getText());
					break;
				}
				}
		
		 driver.quit();
	}

}
