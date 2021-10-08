package uploadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		/**
		// Using send Keys
		driver.findElement(By.id("file-upload")).sendKeys("E:\\all documents\\New folder\\sample.pdf");
		**/
		
		// Using Robot class
		WebElement button=driver.findElement(By.id("file-upload"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click(); ",button);  // click the button
		
		
		/** now after click we are going to do THREE Things 
		1. copy the path
		2.CTRL + V
		3.ENTER
		**/
		
		Robot rb=new Robot();
		rb.delay(3000);
		
		// 1.copy and put the path to file clipboard
		StringSelection ss=new StringSelection("E:\\all documents\\New folder\\sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
		
		// 2.CTRL +V
		rb.keyPress(KeyEvent.VK_CONTROL); // press the CTR
		rb.keyPress(KeyEvent.VK_V);       // press the V
		rb.delay(3000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL); // relese the CTR
		rb.keyRelease(KeyEvent.VK_V);      // relaste the V
		rb.delay(3000);
		
		//3. ENter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//div[contains(@class,'engage w100 fl tc engage-desktop')]//div//div[contains(@class,'modal-mask')]//div[contains(@class,'animated upload-resume-modal')]//section[contains(@class,'modal-body')]//div//span[contains(@class,'action-cta')]")).click();
		

	}

}
