package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ldemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver sng =new ChromeDriver();
		
		sng.get("https://www.facebook.com");
		String f= sng.getTitle();
		System.out.println(f);
		sng.findElement(By.id("email")).sendKeys("snehalgilorkar@gmail.com");
	
		Thread.sleep(5000);
		
	}
	}
