package jenkinsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demotestng {
	@Test
public void testjenkins() {
	System.out.println("Welcome jenkins");
WebDriver driver; // declare webdriver instance
  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe"); // set driver path
    driver =new ChromeDriver(); // instantiate new firefox driver

    driver.get("https://www.google.com"); // open google.com

    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");

	
	
}
	

	
	
}
