package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBhome {
	public static WebDriver driver;
	 
	 @FindBy (id="email" ) WebElement email;
	 @FindBy (id="pass" ) WebElement pass;
	    @FindBy (xpath="//*[@name='login']") WebElement login;
	 
	 public FBhome(WebDriver driver) {
	  FBhome.driver=driver;
	  PageFactory.initElements(driver, this);
	  }
	 
	 public void emailid(String emailtext) {
	  email.clear();
	  email.sendKeys(emailtext);
	 }
	 
	 public void password(String passtext) {
	  pass.sendKeys(passtext);
	 }
	 
	 public void loginclick() {
	  login.click();
	 }
	 
	}

	
	
	
	
	
	
	


