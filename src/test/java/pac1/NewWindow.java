package pac1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewWindow {

		
		public static WebDriver driver;
		public static JavascriptExecutor js;
		public static WebDriverWait wait;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
			
			driver.get("https://demoqa.com/browser-windows"); 
							
			
			
			
				
			
			
			
				driver.switchTo().newWindow(WindowType.WINDOW);
				
			
			
				
			

	}

}
