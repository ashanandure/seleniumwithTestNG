
package Tutorial1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo5 {
	
	@BeforeMethod
	public void setup() {
	System.out.println("Before method");
	}

	@Test(priority=1)
	public void loginPage() {
		System.out.println("login page");	
	}
	
	@Test(priority=2)
	public void homePage() {
		System.out.println("home page");		
	}
	
	@Test(priority=3)
	public void pimPage() {
		System.out.println("pim page");		
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("After Method");		
	}
}
