package pac2;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosugggest {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/autocomplete/");

		WebElement wb = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(wb);

		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("a");
		Thread.sleep(5000);

		List<WebElement> list =

				driver.findElements(By
						.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']//li//div"));

		for (WebElement wbq : list) {
			String str = wbq.getText();

			System.out.println(str);

		}

		for (int i = 0; i <= list.size() - 1; i++) {

			if (list.get(i).getText().equalsIgnoreCase("Asp")) {

				list.get(i).click();

				Thread.sleep(4000);
				break;
			}
		}

		driver.quit();

	}

}
