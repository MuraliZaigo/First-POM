package hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	
/*		
	 By Email = By.name("email");
	 By Pwd = By.name("password");
	By Button = By.className("login100-form-btn");
	
	
	public void mail(String user) {
		driver.findElement(Email).sendKeys(user);;
		
	}

	public void password(String pass) {
		driver.findElement(Pwd).sendKeys(pass);	
		
	}

	public void submit() {
		driver.findElement(Button).click();
		
	} */
	
	WebDriver driver;

	@FindBy(name="email")
	public static WebElement userName;

	@FindBy(name="password")
	public static WebElement password;

	
	
}
