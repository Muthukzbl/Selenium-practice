package Alerts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement password=driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("admin");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		System.out.println(driver.getTitle());
		String actual_title=driver.getTitle();
		String title="Dashboard / nopCommerce administration";
		if(actual_title.equals(title))
			System.out.println("Expected");
		else
			System.out.println("Unexpected Title");
		driver.close();
		
		driver.navigate().to(title);

	}

}
