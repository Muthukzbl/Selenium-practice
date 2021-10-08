package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextvsgetattributevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		//Capturing emailinput box with getText () and Getattribute ()
		WebElement emailinputbox=driver.findElement(By.id("Email"));
		System.out.println("getAttribut :-"+emailinputbox.getAttribute("value")); // it will return attributevalue
		System.out.println("gettext :-"+emailinputbox.getText());// it will return inner text
		
		
		//Capture Login button with Gettext() and  getattribute()
		WebElement loginbutton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		System.out.println(loginbutton.getAttribute("type"));
		System.out.println(loginbutton.getText());
		
		
		//gettitle
		String pagetitle=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
		System.out.println("pagetitle is"+pagetitle);
		
		driver.close();
		

	}

}
