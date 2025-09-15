package pac2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassPractice {

	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	
	public static void main(String[] args) {
		
		
		//ldfgvjl
		
		
	    driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        // driver.get("https://demoqa.com/menu");

        driver.get("https://text-compare.com/		");
		
		
	}
}
