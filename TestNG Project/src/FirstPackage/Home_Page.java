package FirstPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home_Page {
	
	@BeforeMethod
	public void Precondition() {
		System.out.println("I am homepage before method");
	}
	
	
	@Test
	public void TC1() {
		System.out.println("Homepage test case");
	}

	@AfterMethod
	public void Aftercondition() {
		System.out.println("I am homepage after condition");
	}
}
