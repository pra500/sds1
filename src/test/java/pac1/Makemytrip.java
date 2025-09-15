package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Makemytrip {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();

		// Open the login page	
		driver.get("https://practicetestautomation.com/practice-test-login/"); // Replace with your login page URL

		// Locate username, password fields, and login button

		WebElement usernameField = driver.findElement(By.id("username")); // Update locator if needed
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("submit"));

		// Input credentials
		usernameField.clear();
		usernameField.sendKeys("student");

		passwordField.clear();
		passwordField.sendKeys("Password123"); // Replace with your actual password

		// Click the login button
		loginButton.click();

		// Wait for a welcome element (or dashboard element) to appear after login
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Logged In Successfully']"))); // Update
																														// with
																														// the
																														// correct
		// post-login element ID

		// Validate login success (example)
		String welcomeText = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).getText();
		if (welcomeText.contains("Logged")) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login failed!");
		}

		String title = driver.getTitle();

		if	 (title.equalsIgnoreCase("Logged In Successfully | Practice Test Automation"))

			System.out.println("correct title");
		else		

			System.out.println("incorrect title");

		String home = driver.findElement(By.xpath("//a[contains(text(), 'Home')]")).getText();

		if (home.equalsIgnoreCase(home))
			System.out.println("home exists");
		else
			System.out.println("home doesn't exist");

		driver.findElement(By.xpath("//a[text()='Log out']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(200, 400)", "");

		js.executeScript("window.scrollBy(300, -200)", "");

		WebElement usernameee = driver.findElement(By.id("username"));

//	wait =new WebDriverWait(driver, Duration.ofSeconds(4));
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));

		js.executeScript("arguments[0].style.border = '3px solid red'", usernameee);

		// js ll read the title and give us

		String titleofthepage = js.executeScript("return document.title;").toString();
		System.out.println(titleofthepage);
		
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println(domain);							
				

		
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);

					
		
		
		//it ll take u till dat particular element		
		WebElement copyright=
		driver.findElement(By.xpath("//span[normalize-space()='© Copyright 2020 Practice Test Automation. All rights reserved | Privacy Policy']"));
		js.executeScript("arguments[0].scrollIntoView(true);", copyright);
		copyright.click();
					
		
		Thread.sleep(5000);
		
		js.executeScript("history.go(0)");		
		
		
		driver.quit();		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// notes:
		// StaleElementReferenceException	
		
		//javascrkpffffnef w weqwe we qwehhe eee 2h	
	
		
		
		
		
		
		

	}

}
