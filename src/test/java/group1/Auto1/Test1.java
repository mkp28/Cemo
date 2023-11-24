package group1.Auto1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
		
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dkusha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			WebElement ser = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			ser.sendKeys("LG");
			WebElement srbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
			srbtn.click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement tv1 = driver.findElement(By.xpath("//span[contains(text(),'UA32T4340BKXXL ')]"));
			js.executeScript("arguments[0].scrollIntoView(true)", tv1);
			
			tv1.click();
			
			// window handling
			String par = driver.getWindowHandle();
			Set<String> chi = driver.getWindowHandles();
			
			for(String x:chi)
			{
				if(!par.equals(x))
					
				{
					driver.switchTo().window(x);
				}
			}
			
			WebElement price = driver.findElement(By.xpath("(//span[text()='12,990'])[5]"));
			String text = price.getText();
			System.out.println(text);
			

	}

}
