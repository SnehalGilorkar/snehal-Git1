package baseLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass{
	//pom without page factory.
	
	 By username=By.id("txtUsername");
	 By Password =By.id("txtPassword");
	 By loginbutton=By.id("btnLogin");
	 
	 
	 public LoginPage(WebDriver driver){
		 LoginPage.driver=driver;
	 }
	 
	 public void loginFunctionality(String uname, String password) {
		 driver.findElement(username).sendKeys(uname);
		 driver.findElement(Password).sendKeys(password);
		 driver.findElement(loginbutton).click();
	 }
	 
	
	
	
}


