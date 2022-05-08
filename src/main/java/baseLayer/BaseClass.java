package baseLayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{

	public static WebDriver driver;
	
	public static void inilization() {
		System.setProperty("webdriver.chrome.driver",
				"‪C:\\Users\\hp\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");


	}
}