package selectoperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	    WebElement wb= driver.findElement(By.id("day"));
		Select sl =new Select(wb);
	  
		List <WebElement> ls = sl.getOptions();
		int ab =  ls.size();
		System.out.println(ab);
								
		for(WebElement t:ls)
		{
			String b = t.getText();
			System.out.println(b);
			
		}
		
	}
}
