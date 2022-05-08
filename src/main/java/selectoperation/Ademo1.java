package selectoperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ademo1 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	
	WebDriver wb = new ChromeDriver();
	
	wb.get("https://ui.cogmento.com/\r\n"+ "");
	wb.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	/* wb.manage().window().minimize();
	Thread.sleep(4000);
	wb.manage().window().fullScreen();
	wb.manage().window().minimize();*/

	wb.findElement(By.xpath("//input[@name='email']")).sendKeys("prafulp1010@gmail.com\r\n"+ "");
	wb.findElement(By.name("password")).sendKeys("Pr@ful0812\r\n"+ "");
	wb.findElement(By.xpath("//div[text()='Login']")).click();
	
	 

	}
}
