package pac2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autooo {

	

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;

	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/howto/howto_css_searchbar.asp");
	List<WebElement>list=driver.findElements(By.xpath("//img"));
	
	System.out.println(list.size());
	
		
		
		
		
	}
}
