package ToolTip_NewTap_MultipleWIndow_Size_location;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class UrlIn2Tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB); // ithu work agum but dependnces nala work agala
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.opencart.com/)");
		
		
		

	}

}
