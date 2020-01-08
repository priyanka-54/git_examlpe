package ParrallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f()
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\selenium3.14\\geckodriver21.exe");	
      WebDriver driver=new FirefoxDriver();
      String Url="https://www.Amazon.com/";
      driver.get(Url);
      System.out.println("today");
  }
}
