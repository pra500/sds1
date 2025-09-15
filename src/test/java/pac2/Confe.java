package pac2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Confe {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://confe.io/");

		// signup:
		
		/*
		driver.findElement(By.xpath("(//span[@class='elementor-button-content-wrapper'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rashih124r@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rrashi19@123");

		// driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();

		System.out.println("Please solve the captcha manually within 30 seconds...");
		Thread.sleep(30000); // give tester time to enter captcha

		driver.findElement(By.xpath("//div[@class='p-checkbox-box']")).click();

		driver.findElement(By.xpath("//span[text()='Create your account']")).click();

		driver.findElement(By.xpath("//p-button[@label='Sign In']")).click();

		driver.findElement(By.xpath("//span[@data-testid='travel-card-close']")).click();

		*/
		
		
		
		
//login:
		
		driver.findElement(By.xpath("(//span[@class='elementor-button-content-wrapper'])[1]")).click();

	//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rashih124r@gmail.com");
	//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rrashi19@123");

		// driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();

		
		
		//driver.findElement(By.xpath("//p-button[@label='Sign In']")).click();
		driver.findElement(By.xpath("//a[text()='Sign in now']")).click();
		
		
		
		
			/*			
		
		WebElement wbb = driver
				.findElement(By.xpath("//input[@id='username']"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wbb));
		wbb.click();
		
		
		*/
				

		driver.navigate().refresh();
		
		//wbb.clear();		
		 
		WebElement wbb1=	driver.findElement(By.xpath("//input[@id='username']"));
				wbb1.sendKeys("rashih124r@gmail.com");
		

		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rashih124r@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rrashi19@123");
		
		//driver.get("https://app.confe.io/auth?disableCaptcha=true");
		

		System.out.println("Please solve the captcha manually within 30 seconds...");
				Thread.sleep(20000); // give tester time to enter captcha
				
			WebElement signin=	driver.findElement(By.xpath("//p-button[@label='Sign In']"));				
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", signin);
				
				driver.quit();					
		
	}

}
