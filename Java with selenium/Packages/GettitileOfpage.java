package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettitileOfpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://frontend.nopcommerce.com/");
		System.out.println("title of the page:"+driver.getTitle());
		System.out.println("title of the page:"+driver.getCurrentUrl());
		System.out.println("title of the page:"+driver.getPageSource());
		driver.close();
		
	

	}

}
