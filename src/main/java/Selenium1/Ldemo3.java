package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ldemo3 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard\r\n"
				+ "");
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.name("firstName")).sendKeys("Snehal");	
        driver.findElement(By.name("lastName")).sendKeys("Gilorkar");
        driver.findElement(By.id("btnSave")).click();
        
		
        Thread.sleep(4000);
        driver.findElement(By.id("btnSave")).click();

        Thread.sleep(4000);
        
	    driver.findElement(By.id("personal_optGender_2")).click();
	    System.out.println("Female is selected");
	    driver.findElement(By.id("btnSave")).click();
	    
	
	   
	}

}
