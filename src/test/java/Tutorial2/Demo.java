package Tutorial2;

import org.testng.annotations.Test;

public class Demo {
	@Test(groups="Regression")
	public void loginPage() {
	System.out.println("regression testing in Demo");
	}

	
	@Test(groups="Sanity testing")
	public void homePage() {
	System.out.println("sanity testing in Demo");
	}

	
	@Test(groups="system testing")
	public void searchPage() {
	System.out.println("system testing in Demo");
	}

	@Test(groups="Regression")
	public void adminPage() {
	System.out.println("regression testing in Demo");
	} 
	
	

}
