package tnpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Edurekalogin 
{
	
	
	WebDriver driver;
public void loginEdu()
{
System.setProperty("Webdriver.chrome.driver","‪F:\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("https://www.edureka.co");

}

}
