package pac1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {

	// 5 tc's

	WebDriver driver;
	JavascriptExecutor js;

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://elementalselenium.com/");

	}

	@Test(priority = 1)
	public void fTest() {

		driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();

		String intermeduate = driver.findElement(By.xpath("(//small[text()='INTERMEDIATE'])[1]")).getText();

		Assert.assertEquals(intermeduate, "INTERMEDIATE");

	}

	@Test(priority = 2, dependsOnMethods = "fTest")
	public void f1Test() {

		driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();

		String intermeduate = driver.findElement(By.xpath("(//small[text()='INTERMEDIATE'])[1]")).getText();

		Assert.assertEquals(intermeduate, "INTERMEDIATE");

	}

	@Test(priority = 3, dependsOnMethods = { "fTest", "f1Test" })
	public void f2Test() {

		WebElement orderposted = driver.findElement(By.xpath("//button[text()='Order Posted']"));

		Actions act = new Actions(driver);
		act.moveToElement(orderposted).perform();

		driver.findElement(By.xpath("//a[text()='Newest']")).click();

	}

	@Test(priority = 4, dependsOnMethods = { "fTest", "f1Test", "f2Test" })
	public void f3Test() {

		WebElement wb = driver.findElement(By.xpath("//a[text()='External Resources']"));

		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", wb);

		String ExternalResources = driver.findElement(By.xpath("//h1[text()='External Resources']")).getText();

		Assert.assertEquals(ExternalResources, "External Resources");

	}

	@Test(priority = 5, dependsOnMethods = { "fTest", "f1Test", "f2Test", "f3Test" })
	public void f4Test() {

		WebElement getinvolved = driver.findElement(By.xpath("//a[text()='Get Involved']"));

		js.executeScript("arguments[0].click();", getinvolved);

		String community = driver.findElement(By.xpath("//h1[text()='Community']")).getText();

		Assert.assertEquals(community, "Community");

	}

	@AfterMethod
	public void afterClass() {

		driver.quit();

	}

}
