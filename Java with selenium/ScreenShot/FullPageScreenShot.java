package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class FullPageScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		/*
		//1.Full page Screen Shot
		TakesScreenshot st=(TakesScreenshot)driver;
		File src=st.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\homepagee.png");
		FileHandler.copy(src,trg);   */
		
 
		// intha method na stack overflow la irunthu edutha ithuvum work aguthu
		/*       
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(".\\Screenshots\\homepage.png"));
		*/
		
		
		
		/*
		//2. Get ScreenShot for Particular section.
		WebElement section =driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src=section.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\section.png");
		FileHandler.copy(src,trg);
		
		*/
		
		
		//3.Get ScreenShot for webelement
		WebElement section =driver.findElement(By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']"));
		File src=section.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\webelement.png");
		FileHandler.copy(src,trg);
		 
		driver.close();
		
	}

}
