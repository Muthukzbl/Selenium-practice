package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://frontend.nopcommerce.com/");
		WebElement searchstore =driver.findElement(By.xpath("//input[@id='small-searchterms']")); //somthing showing error try to use someother url
		
		System.out.println(searchstore.isDisplayed());
	    //System.out.println(searchstore.isEnabled());
		//System.out.println(searchstore.isSelected());
		
		
		driver.close();

	}

}
