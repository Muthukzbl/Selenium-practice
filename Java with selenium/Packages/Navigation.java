package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://www.snapdeal.com");
		//driver.get("http://www.amazon.com");
		driver.navigate().to("httnp://www.amazon.com");
		
		
		driver.navigate().back(); //snapdeal ku pogum
		driver.navigate().forward(); //amazon ku pogum
		driver.navigate().refresh();
		
		


	}

}
