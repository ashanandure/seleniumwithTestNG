package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {
	WebDriver driver;
	@Test
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.quit();
	}
		
		@Test(priority=2)
		public void loginFunctinality() {
		driver.findElement(By.id("Username")).sendKeys("Admin");
		driver.findElement(By.id("Password")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();	
		}
		
		@Test(priority=3)
		public void varifyTitle() {
			String a=driver.getTitle();
		Assert.assertEquals(a, "OrengeHRM");
		}
		
		
		@Test(priority=4)
		public void tearDown() {
			driver.close();
			
	}
		
}		