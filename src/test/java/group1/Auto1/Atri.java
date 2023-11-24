package group1.Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Atri {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dkusha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("mani");
		String attribute = ele.getAttribute("value");
		System.out.println(attribute);
}}
