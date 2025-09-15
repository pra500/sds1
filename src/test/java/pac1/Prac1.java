package pac1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prac1 {

	public static WebDriver driver;	
	public static JavascriptExecutor js;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("--incognito");
		//co.addArguments("--headless");
		co.addArguments("--window-size=1920,1080");
		co.addArguments("--start-maximized");
		co.addArguments("--disable-save-password-bubble");
		co.addArguments("--disable-extensions");	

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");

		js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);

		if (title.contains("Practice")) {
			System.out.println("correct");
		} else {
			System.out.println("not correct");
		}

		String url = js.executeScript("return document.URL;").toString();

		System.out.println(url);
		
		driver.quit();
	}

}
