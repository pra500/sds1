package pac1;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Make1 {
	
	
	
		    WebDriver driver;
		    JavascriptExecutor js;

		    public void setUp() {
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.manage().deleteAllCookies();
		        driver.get("https://elementalselenium.com/");
		        js = (JavascriptExecutor) driver;
		    }

		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }
		    }

		    public void runAutomation() {
		        try {
		            // Step 1: Click "Take me to the tips!"
		            driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
		            String intermediate = driver.findElement(By.xpath("(//small[text()='INTERMEDIATE'])[1]")).getText();
		            System.out.println("Step 1: INTERMEDIATE text: " + intermediate);

		            // Step 2: Click "Take me to the tips!" again
		            driver.navigate().back(); // Go back to simulate fresh click
		            driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
		            String intermediate2 = driver.findElement(By.xpath("(//small[text()='INTERMEDIATE'])[1]")).getText();
		            System.out.println("Step 2: INTERMEDIATE text: " + intermediate2);

		            // Step 3: Click "Order Posted" then "Newest"
		            WebElement orderposted = driver.findElement(By.xpath("//button[text()='Order Posted']"));
		            Actions act = new Actions(driver);
		            act.moveToElement(orderposted).perform();
		            driver.findElement(By.xpath("//a[text()='Newest']")).click();
		            System.out.println("Step 3: Clicked Newest");

		            // Step 4: Click "External Resources" using JS
		            WebElement wb = driver.findElement(By.xpath("//a[text()='External Resources']"));
		            js.executeScript("arguments[0].click();", wb);
		            String externalResources = driver.findElement(By.xpath("//h1[text()='External Resources']")).getText();
		            System.out.println("Step 4: Page title: " + externalResources);

		            // Step 5: Click "Get Involved" using JS
		            WebElement getinvolved = driver.findElement(By.xpath("//a[text()='Get Involved']"));
		            js.executeScript("arguments[0].click();", getinvolved);
		            String community = driver.findElement(By.xpath("//h1[text()='Community']")).getText();
		            System.out.println("Step 5: Page title: " + community);

		        } catch (Exception e) {	
		            e.printStackTrace();
		        }
		    }

		    public static void main(String[] args) {
		    	Make1 test = new Make1();
		        test.setUp();
		        test.runAutomation();
		        test.tearDown();
		    }
		


	}


