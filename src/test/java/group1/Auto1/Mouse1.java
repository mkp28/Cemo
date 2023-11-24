package group1.Auto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse1 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dkusha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement mob = driver.findElement(By.xpath("//a[@id='overview-tab']"));
	mob.click();
	WebElement over1 = driver.findElement(By.id("//h3[@id='heading664']"));
	over1.click();
	Thread.sleep(5000);
	WebElement cur = driver.findElement(By.xpath("//li[contains(text(),'upgraded versions to align')]"));
	String cur1 = cur.getText();
	System.out.println(cur1);
	
	
}
}
