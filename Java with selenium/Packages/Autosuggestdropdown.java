package Packages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//span"));
		System.out.println("Total number of links " + options.size());
		
		for (WebElement ptye:options) 
		{
			if (ptye.getText().equals("selenium"))
			{
				ptye.click();
				break;
			}
		}
		
		
		
	}

}
