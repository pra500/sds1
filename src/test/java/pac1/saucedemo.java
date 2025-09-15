package pac1;

import java.time.Duration;


import org.bouncycastle.asn1.cmp.ErrorMsgContent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.*;



public class saucedemo {

//1. Login Page Validation:

//	Verify successful login with valid credentials.
//
//	Verify error messages with invalid username/password.
//
//	Verify forgot password functionality.

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().deleteAllCookies();

		// Open the login page
		driver.get("https://www.saucedemo.com/v1/"); // Replace with your login page URL
//		
//
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//
//		driver.findElement(By.xpath("//input[@id='login-button']")).click();
//
//		driver.navigate().back();
//
//		driver.findElement(By.xpath("//input[@id='user-name']")).clear();
//
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user1");
//
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
//
//		driver.findElement(By.xpath("//input[@id='login-button']")).click();
//
//		String errromsg = driver.findElement(By.xpath(
//				"//h3[normalize-space()='Epic sadface: Username and password do not match any user in this service']"))
//				.getText();
//
//		if (errromsg.equalsIgnoreCase("Epic sadface: Username and password do not match any user in this service"))
//
//			System.out.println("msg correct");
//		else
//			System.out.println("msg incorrect");
//
//		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
//
//		WebElement Password =
//
//				driver.findElement(By.xpath("//input[@id='password']"));
//
//		WebElement Login =
//
//				driver.findElement(By.xpath("//input[@id='login-button']"));
//
//		js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value = 'performance_glitch_user';", username);
//
//		js.executeScript("arguments[0].value = 'secret_sauce';", Password);
//
//		js.executeScript("arguments[0].click();", Login);
//
//		String title = driver.getTitle();
//
//		if (title.equalsIgnoreCase("Swag Labs"))
//
//			System.out.println("user landed successfully");
//
//		else
//
//			System.out.println("user doesn't land successfully");
//		
//		
//		
//		
				
		//login, print all elem's, price (low to high),  add to cart , cart bucket click
				
		driver.get("https://www.saucedemo.com/v1/"); // Replace with your login page URL

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
				
		List<WebElement> list=driver.findElements(By.xpath("//select[@class='product_sort_container']"));
		
		for(int i=0;i<=list.size()-1;i++)			
		{

			System.out.println(list.get(i));
			if(list.get(i).getText().equalsIgnoreCase("Name (Z to A)"))
			{ 
				(list.get(i)).click();	
				break;
				
			}	
						
		}		
		
		driver.findElement(By.xpath("//*[local-name()='svg']//*[name()='path' and contains(@fill, 'currentColor')]")).click();		
				
		
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		
							
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		driver.quit();

	}

}
