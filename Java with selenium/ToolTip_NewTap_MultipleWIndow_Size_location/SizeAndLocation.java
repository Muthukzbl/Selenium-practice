package ToolTip_NewTap_MultipleWIndow_Size_location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		// Methode 1 for Location
		WebElement img=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(img.getLocation());
		System.out.println(img.getLocation().getX());
		System.out.println(img.getLocation().getY());
		
		// Methode 2
		System.out.println(img.getRect().getX());
		System.out.println(img.getRect().getY());
		
		
		// Methode 1 for Size and width

		System.out.println(img.getSize());
		System.out.println(img.getSize().getHeight());
		System.out.println(img.getSize().getWidth());
		
		//Methode 2
		System.out.println(img.getRect().getDimension().getHeight());
		System.out.println(img.getRect().getDimension().getWidth());
		
		driver.close();
		
		
		
		
		
		

	}

}
