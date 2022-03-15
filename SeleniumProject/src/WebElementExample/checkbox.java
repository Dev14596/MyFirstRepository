package WebElementExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://demoqa.com/checkbox");
		System.out.println(obj.getTitle());
		obj.manage().window().maximize();
		
		//WebElement homecheck=obj.findElement(By.xpath("//label[@for=\"tree-node-home\"]/span[@class=\"rct-checkbox\"]"));
		//homecheck.click();
		
	   
		
		//WebElement Arrowbutton=obj.findElement(By.xpath("//button[@class=\"rct-collapse rct-collapse-btn\"]"));
		//Arrowbutton.click();
		 
		WebElement Arrowbutton1=obj.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		Arrowbutton1.click();
		
		WebElement Arrowbutton2=obj.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
		Arrowbutton2.click();
		//li[@class=\"rct-node rct-node-parent rct-node-expanded\"]/span[@class=\"rct-text\"]/button[@class=\"rct-collapse rct-collapse-btn\"]
		
		 WebElement homecheck=obj.findElement(By.xpath("//span[@class=\"rct-checkbox\"]"));
			if(!homecheck.isSelected()) {
			homecheck.click();//label[@for=\"tree-node-home\"]/span[@class=\"rct-checkbox\"]
			
		/*WebElement Result=obj.findElement(By.id("result"));
		if(Result.isDisplayed()){
			System.out.println(Result.getText());
		}*/
		
		List<WebElement>result=obj.findElements(By.id("result"));
		if(result.size()>0) {   //size is method of collection.
			System.out.print(result.get(0).getText());
		}else {
			System.out.println("test case is failed,system is not showing result");
		}
		
			}
				}

}
