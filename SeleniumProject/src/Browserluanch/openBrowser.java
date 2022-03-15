package Browserluanch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowser {
public static WebDriver Driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For Chrome Browser latest version is 98
		System.setProperty("webdriver.chrome.driver","./Resorces/chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.myntra.com/login");
		System.out.println(obj.getTitle());
		obj.manage().window().maximize();
		//obj.manage().window().minimize();
		//obj.close();
		
		//For Firefox Browser latest version is 97
		//System.setProperty("webdriver.gecko.driver","F:\\ellips workspace\\SeleniumProject\\Resorces\\geckodriver.exe");
		//FirefoxDriver obj1 = new FirefoxDriver();
		//obj1.get("https://www.myntra.com/login");
		//System.out.println(obj1.getTitle());
		//obj1.navigate().to("https://www.myntra.com/login");//this method also used to enter url on browser.
		
	}

}
			