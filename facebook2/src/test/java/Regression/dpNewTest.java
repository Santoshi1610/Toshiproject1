package Regression;

import org.testng.annotations.Test;

import Commoncode.Baseclass;
import pages.FBhome;

import org.testng.annotations.DataProvider;

public class dpNewTest extends Baseclass {
  @Test(dataProvider = "dp")
  public void f(String emailid, String pass) throws InterruptedException {
	  
FBhome ob= new FBhome(driver);
ob.emailid(emailid);
ob.password(pass);
ob.loginclick();
driver.navigate().back();
Thread.sleep(5000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaaaaa" },
      new Object[] { "def@yahoo.com", "bbbbbbb" },
    };
  }
}
