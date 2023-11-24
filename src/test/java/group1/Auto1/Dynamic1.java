package group1.Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Anna_University");
		WebElement findElement = driver.findElement(By.xpath("//a[text()='A Lalitha']//following::li//a[text()='A. C. Muthiah']//following::li//a[text()='Nagarjuna']"));
		
		Thread.sleep(3000);
		findElement.click();
			
	}

}
