package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonewW {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com");
		
		WebDriver d=driver.switchTo().newWindow(WindowType.TAB);
	
		d.get("https://www.facebook.com");
		
		Thread.sleep(10000);
		
		
		driver.quit();
		

	}

}
