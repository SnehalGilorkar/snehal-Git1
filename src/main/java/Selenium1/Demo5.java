package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	
		WebDriver sng =new ChromeDriver();
		
		sng.get("https://www.google.com");
		String g = sng.getCurrentUrl();
     	System.out.println(g);
     	
	    Thread.sleep(5000);

	    sng.navigate().to("https://www.facebook.com");
	    String f = sng.getCurrentUrl();
	    System.out.println(f);
	    
	    Thread.sleep(5000);

	    String f2 = sng.getTitle();
	    System.out.println(f2);
	    
	    Thread.sleep(5000);

	    sng.navigate().back();
	        
	    Thread.sleep(5000);
	    
	    sng.navigate().forward();
	    
	    Thread.sleep(5000);
        sng.close();
        
		;
		
         
		
		
		
		
	}

}
