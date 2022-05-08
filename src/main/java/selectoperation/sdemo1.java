package selectoperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sdemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://www.linkedin.com/");
		
		String l = wb.getTitle();
		System.out.println(l);
		Thread.sleep(4000);

		
		wb.navigate().to("https://www.amazon.in");
		
		String a = wb.getCurrentUrl();
			
		System.out.println(a);
		
		Thread.sleep(4000);
		
		wb.navigate().back();
		
		String lb = wb.getCurrentUrl();
		System.out.println(lb);
		
		wb.navigate().forward();
		
	    String am=wb.getCurrentUrl();
	    System.out.println(am);
		
	    String amt= wb.getTitle();
	    
	    Thread.sleep(4000);
	    	    
	    if(amt.contains("Online Shoping site in India"))
	    {
	    	System.out.println("Test case is pass");
	    	
	    }
	    else

	    	System.err.println("Test case is fail");
	    
	    
		wb.close();
		
		

	}

}
