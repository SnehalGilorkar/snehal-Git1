package tnpractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTng {
	WebDriver driver;
	
	@Test(priority=1)
	public void pune() {
		System.out.println("Pune");
	}
	
	
	
	@Test(priority=1)
	public void mumbai() {
		System.out.println("mumbai");
	}
	
	
	@Test(priority=101)
	public void delhi() {
		System.out.println("delhi");
	}
	@Test
		public void loginEdu()
	{
		System.setProperty("Webdriver.chrome.driver","F://chomrdriver.exe");
				driver.get("https://www.edureka.co");
		
	}
	

  }

