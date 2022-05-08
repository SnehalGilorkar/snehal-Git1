package xpathdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("adhar card");
driver.findElement(By.xpath("//a[text()='Sign in']")).click();
driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @id='identifierId']")).sendKeys("snehalgilorkar95@gmail.com");
driver.findElement(By.xpath("//span[text()='Sign in']")).click();

//driver.findElement(By.xpath("//a[@class='FH']")).click();

	} 
	

}
