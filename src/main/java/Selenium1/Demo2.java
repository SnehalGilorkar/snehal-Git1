package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	 Thread.sleep(5000);
	 
	 driver.navigate().to("https://wwww.facebook.com");
	 
		String a = driver.getTitle();
		
	 if(a.equals("Facebook-Log in or Sign up"))
			 {
		 System.out.println("Test case pass");
		 		 
			 }
			 else
	 {
		 System.out.println("Test case failed ");
	 }
     driver.close();
     	}

}
