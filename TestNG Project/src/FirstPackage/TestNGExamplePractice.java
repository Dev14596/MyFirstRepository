package FirstPackage;

import org.testng.annotations.Test;

public class TestNGExamplePractice {
	
	@Test(description="verify username and password with valid credential",priority=4,groups= {"Smoke","Sanity","Regression"},dependsOnMethods="TC4")
	public void TC1() {
		System.out.println("i am from TC1");
	}
	
	@Test(description="verify userneme and password with invalid credential",priority=2,groups= {"Smoke"},invocationCount=1)
	public void TC2() {
		System.out.println("i am from TC2");
	}
	
	@Test(description="verify password should be in display encrypted format",priority=3,groups= {"Sanity"})//dependsOnMethods="TC2"
	public void TC3() {
		System.out.println("i am from TC3");      
	}
	
	@Test(description="verify username with valid credential",priority=4,groups= {"Sanity","Regression"})//dependsOnMethods="TC2"
	public void TC4() {
		System.out.println("i am from TC4");      
	}


}
