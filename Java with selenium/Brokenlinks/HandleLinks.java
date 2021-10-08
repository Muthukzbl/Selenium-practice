package Brokenlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElementByLinkText("Best Sellers").click();
		//driver.findElementByPartialLinkText("Sellers").click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links " + links.size());
		
		/*
		// Normal loops
		for(int i=0; i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());

			System.out.println(links.get(i).getAttribute("href"));
			
			
		}
		*/
		
		
		for (WebElement link:links)
		{

			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		

	}

}
