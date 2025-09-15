package pac2;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pa {
	
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;

	 
public static void main(String[] args) {
	
	

	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();
	driver.get("https://demo.automationtesting.in/Register.html?utm_source=chatgpt.com");
	
	 String   url=driver.getCurrentUrl();	
	 System.out.println(url);
	 
	 
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("tomsmith");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("tomsmithxcsd@123");
		
		

	
	 
	 
	 
	
	
	
	
	
	
	
	
	
}
}
