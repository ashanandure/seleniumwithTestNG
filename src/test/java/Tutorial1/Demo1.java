package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
@Test
public void abc() 
{
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();

driver.get("http://www.google.com");
driver.quit();

}

}


