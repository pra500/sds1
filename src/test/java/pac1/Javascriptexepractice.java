package pac1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexepractice {

	// scroll down/up
	// home click and get the title
	// value enter
	// page refresh
	// get the url, domain, title

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(300, 500)", "");

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -400)", "");

		WebElement home = driver.findElement(By.xpath("//button[text()='Home']"));
		js.executeScript("arguments[0].click();", home);

		String title = js.executeScript("return document.title;").toString();
		System.out.println(title); // Selenium, API Testing, Software Testing &amp; More QA Tutorials | Rahul
									// Shetty Academy

		driver.get("https://practice.expandtesting.com/login");
		js.executeScript("window.scrollBy(200, 480)", "");

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		js.executeScript("arguments[0].value = 'practice';", username);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		js.executeScript("history.go(0)");

		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);

		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);

		String titleofpage = js.executeScript("return document.title").toString();
		System.out.println(titleofpage);

		driver.quit();

	}

}
