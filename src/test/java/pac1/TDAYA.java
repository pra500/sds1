package pac1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TDAYA {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;
	public static List<WebElement> list;
	public static int i;
	public static int j;
	public static int k;

	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		list = driver.findElements(By.xpath("//input"));
		System.out.println(list.size());

		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

		WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select sel = new Select(drop);
		sel.selectByVisibleText("Option2");
					
		
driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("in");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		list=driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']//li//div"));	
		
		System.out.println(list.size());
		
		for(int j=0;j<=list.size()-1;j++)
		{
			String sss=list.get(j).getText();			
			System.out.println(sss + " ");
		}
				
		
		for (int i = 0; i <= list.size() - 1; i++)			
				{			
		
					if (list.get(i).getText().equalsIgnoreCase("India")) {
						list.get(i).click();
						Thread.sleep(5000);
						break;

			}
		}
		
		
		driver.quit();
	}

}
