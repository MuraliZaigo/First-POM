package hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase extends Login {

	@Test
	public void test() {

	System.setProperty("webdriver.chrome.driver", "F:\\Murali-Test\\Mine\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://80.211.233.121/zaihrms/login");

	PageFactory.initElements(driver, Login.class);
	
	Login.userName.sendKeys("hello");
 
	
	}
}
