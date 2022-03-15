package Practiceselenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//find no of columns
	   List <WebElement> column=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
	    System.out.println("Total no of column is  : " + column.size());
	    
	    //find total no of rows
	    List <WebElement> Row=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
	    System.out.println("Total no of Row is  : " + Row.size());
		
	    //Retrieve the specific row/column data
	    WebElement Rowdata=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[2]/th"));
	    System.out.println("Retrive data clock tower hotel  : " + Rowdata.getText());
	    
	    //Retrieve all data  from table
	 List<WebElement> data=driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr/td"));
	 Iterator<WebElement> itr=data.iterator();
	    	while(itr.hasNext()) {
	    		System.out.println(itr.next().getText());
	    }
	    	
	    	for(int r=1;r<=Row.size();r++) {
	    		WebElement structure=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr["+r+"]/th[1]"));
	    		structure.getText();
	    	    if(structure.equals("Burj Khalifa")) {
	    	    	WebElement contry=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr["+r+"]/th[2]"));
		    		System.out.println(contry.getText());
	    	    }
	    	}
	    	
	    	
	    	
	    
	    driver.quit();
	}
}
