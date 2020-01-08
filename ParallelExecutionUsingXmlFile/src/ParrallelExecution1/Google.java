package ParrallelExecution1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\selenium3.14\\geckodriver21.exe");	
      WebDriver driver=new FirefoxDriver();
      String Url="https://www.google.com/";
      driver.get(Url);
  }
}
