package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	
	 WebDriver driver;
	 
  @Test
  public void fTest() {
	  
		boolean b=  
				  
	  driver.getPageSource().contains("src");
		
		System.out.println(b);

	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod	
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  
	  
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/login?utm_source=chatgpt.com");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }
  
  

}
