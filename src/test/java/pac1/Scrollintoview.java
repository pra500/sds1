package pac1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollintoview {
	

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
		

String url = "https://www.tutorialspoint.com/index.htm";
driver.get(url);

// identify element
WebElement l=driver.findElement(By.xpath("//*[text()='ABOUT US']"));
// Javascript executor
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
Thread.sleep(800);
driver.quit();

	}

}
