package Alerts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		
	
		
		ChromeDriver driver = new ChromeDriver(options);	
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		

	}

}
