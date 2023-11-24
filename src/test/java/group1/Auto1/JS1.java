package group1.Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS1 {
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dkusha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		JavascriptExecutor jk=(JavascriptExecutor)driver;
		WebElement txtuser = driver.findElement(By.id("email"));
		jk.executeScript("arguments[0].setAttribute('value','mkp@gmail.com')",txtuser);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		jk.executeScript("arguments[0].setAttribute('value','Harini28')", txtpass);
	
	WebElement btnlogin = driver.findElement(By.name("login"));
	jk.executeScript("arguments[0].click()", btnlogin);
	}

}
