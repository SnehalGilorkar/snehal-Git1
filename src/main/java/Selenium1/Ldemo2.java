package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ldemo2 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard\r\n"
				+ "");
		
		WebElement wb= driver.findElement(By.id("txtUsername"));
		boolean a=wb.isDisplayed();
		System.out.println(a);
		
		boolean b =wb.isEnabled();
		System.out.println(b);
		
		wb.sendKeys("Admin");
		wb.clear();
		
		WebElement w1= driver.findElement(By.id("txtPassword"));
		w1.isDisplayed();
		System.out.println("Password feild is displayed");
	
		w1.isEnabled();
		System.out.println("Password feild is Enabled");
		
		w1.sendKeys("admin123");
		w1.clear();
	   
		wb.sendKeys("Admin");

		w1.sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Login Suceefulll!!!");
	}

}
