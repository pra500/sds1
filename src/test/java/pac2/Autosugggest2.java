package pac2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.*;

public class Autosugggest2 {

	public static WebDriver driver;
	public static JavascriptExecutor js;	
	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

		driver.findElement(By.xpath("//span[@data-testid='travel-card-close']")).click();
		// span[@data-testid='travel-card-close']

		// from city:
		/*
		 * driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		 * 	
		 * WebElement fromcity =
		 * driver.findElement(By.xpath("//input[@placeholder='From']"));
		 * 
		 * fromcity.sendKeys("g");
		 * 
		 * List<WebElement> list = driver .findElements(By.xpath(
		 * "//ul[@class='react-autosuggest__suggestions-list']//li//div//p"));
		 * 
		 * for (int i = 0; i <= list.size() - 1; i++) { String option =
		 * list.get(i).getText(); System.out.println(option); }
		 * 
		 * for (int j = 0; j <= list.size() - 1; j++) { String option1 =
		 * list.get(j).getText();
		 * 
		 * if (option1.equalsIgnoreCase("Gondia, India")) {
		 * 
		 * js = (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
		 * list.get(j));
		 * 
		 * // list.get(j).click();
		 * 
		 * // Thread.sleep(5000); break;
		 * 
		 * } }
		 */

		System.out.println("-----------------------");
		// to city:

		driver.findElement(By.xpath("//label[@for='toCity']")).click();

		WebElement tocity = driver.findElement(By.xpath("//input[@placeholder='To']"));

		tocity.sendKeys("d");
		Thread.sleep(4000);

		List<WebElement> list1 = driver
				.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li//div//p"));

		for (int i = 0; i <= list1.size() - 1; i++) {
			String option2 = list1.get(i).getText();
			System.out.println(option2);
		}

		for (int i = 0; i <= list1.size() - 1; i++) {

			String option3 = list1.get(i).getText();

			if (option3.equalsIgnoreCase("Dharamshala, India")) {

				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", list1.get(i));

				// list1.get(i).click();

				break;

			}

		}

		// departure:

		WebElement depart = driver.findElement(By.xpath("//label[@for='departure']"));

		js.executeScript("arguments[0].click();", depart);

		js.executeScript("window.scrollBy(300, 400)", "");

		WebElement wbb = driver
				.findElement(By.xpath("//div[@class='DayPicker-Week']//div[@aria-label= 'Fri Aug 29 2025']"));

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wbb));
		wbb.click();

		// driver.findElement(By.xpath("//div[@class='DayPicker-Week']//div[@aria-label=
		// 'Fri Aug 29 2025']")).click();

		Thread.sleep(4000);

		// return:
		WebElement return1 =
				// driver.findElement(By.xpath("//label[@for='return']"));

				driver.findElement(By.xpath("//span[normalize-space()='Return']"));
		js.executeScript("arguments[0].click();", return1);

		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Week']//div[@aria-label= 'Thu Oct 09 2025']")).click();

		
		driver.findElement(By.xpath("//a[text()='Search']")).click();

		Thread.sleep(4000);
      	driver.quit();	  
      	
      	
      	
	}
}
