package tnpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tng1 {
  @Test
  public void f() {

 System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("adhar card");
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @id='identifierId']")).sendKeys("snehalgilorkar95@gmail.com");
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();

	//driver.findElement(By.xpath("//a[@class='FH']")).click();

  }
}
