package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
       driver.navigate().to("https://www.amazon.com");
       
      String b = driver.getCurrentUrl();
       
       System.out.println(b);
       
      String a = driver.getTitle();
      
      System.out.println(a);
       
      
	}

}
