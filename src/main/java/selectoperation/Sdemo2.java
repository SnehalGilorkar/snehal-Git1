package selectoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sdemo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Handling select
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	
	WebDriver wb = new ChromeDriver();
	wb.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard\r\n"+"");
    wb.findElement(By.id("txtUsername")).sendKeys("Admin");
	wb.findElement(By.id("txtPassword")).sendKeys("admin123");
	wb.findElement(By.id("btnLogin")).click();
	
	Thread.sleep(4000);
	wb.findElement(By.id("menu_pim_viewPimModule")).click();
	wb.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Snehal Gilorkar");

	WebElement wbe = wb.findElement(By.id("empsearch_employee_status"));
	Thread.sleep(4000);
	 Select sel = new Select(wbe);
    sel.selectByVisibleText("Full-Time Permanent");
    
    WebElement aw= sel.getFirstSelectedOption();
      
    String es= aw.getText();
    
    System.out.println(es);
    
  /*   WebElement wbi = wb.findElement(By.id("empsearch_termination"));
    
     Select seli = new Select(wbi);
     seli.selectByValue("2");
     
     WebElement wbet=seli.getFirstSelectedOption();
     
     String a= wbet.getText();
     
     System.out.println(a);*/
     
     WebElement wbt= wb.findElement(By.id("empsearch_job_title"));
     
      Select  selt =new Select(wbt);
      selt.selectByIndex(10);
      
      WebElement wbst= selt.getFirstSelectedOption();
      
     String s = wbst.getText();
     System.out.println(s);
    
     wb.findElement(By.id("searchBtn")).click();
     
       
    
	}

}
