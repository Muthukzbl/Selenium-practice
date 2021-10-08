package JavaScriptExecuterDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecuter {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	
		
		/**
		//1. Draw border & getscreenShot
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavascriptUtil.drawBorder(logo, driver);
		
		File src=logo.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\bordercolor.png");
		FileHandler.copy(src,trg);	
		
		**/
		
		/**
		//2.Get tittle 
		String title=JavascriptUtil.getTitleByJS(driver);
		System.out.println(title);
		**/
		
		
		/**
		//3.Click action
		WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavascriptUtil.ClickElementByJS(register, driver);
		**/
		
		/**
		//4. Generate our own alert
		JavascriptUtil.generateAlert(driver, "This is my alert ");
		**/
		
		/**
		//5. Refreshing the page
		JavascriptUtil.refreshBrowserByJS(driver);
		**/
	
		
		/**
		//6. scroll up and down
		
		JavascriptUtil.scrollPageDown(driver);
		
		Thread.sleep(4000);
		
		JavascriptUtil.scrollPageUp(driver);
		
		**/
		
		/**
		//7.Zoom 
		JavascriptUtil.ZoompageByJS(driver);
		**/
		
		
		//8.color flash
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavascriptUtil.flash(logo, driver);		
		
		
		
		
		
		
		

	}

}
