package Tutorial2;

import org.testng.annotations.Test;

public class Demo1 {
	@Test(groups="Regression")
	public void abc() {
	System.out.println("regression testing in Demo1");
	}

	
	@Test(groups="UAT")
	public void homePage() {
	System.out.println("UAT testing in Demo1");
	}

	
	@Test(groups="system ")
	public void searchPage() {
	System.out.println("system testing in Demo1");
	}

	@Test(groups="sanity")
	public void adminPage() {
	System.out.println("sanity testing in Demo1");
	} 
	
}
