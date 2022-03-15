package com.abc.commonfunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//We are developing framework ---Skeleton --Chrome
public class BrowserLaunch {
	
	public static WebDriver driver;
	public static Properties property;
	
	public static void ReadProperty() {
		try {
		property=new Properties();
		property.load(new FileInputStream("src/main/resources/config.properties"));
		} catch(FileNotFoundException e) {
		
	} catch (IOException t) {
		
	}
		
	}

	public void Browser_Initilisation() {
	    ReadProperty();
		String Browsername=property.getProperty("Browsername");
		if(Browsername.equalsIgnoreCase("chrome")) //CH
		{	
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			
		} else if(Browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
				driver=new FirefoxDriver();
		} else {
		System.setProperty("webdriver.edge.driver", "");
		driver=new EdgeDriver();
		
	}
		driver.get(property.getProperty("url"));
	
}
	
	
}
