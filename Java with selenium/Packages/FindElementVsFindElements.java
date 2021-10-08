package Packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		// find element - return single webelement
		//1
		WebElement search=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		search.sendKeys("hai");
		//2
		WebElement ele=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());  // return only first element
		//3
		//WebElement searchbutton=driver.findElement(By.xpath("//*[@id=\\\"small-searchterms\\\"]"));
		//searchbutton.sendKeys("hai"); // it will throw no such element error
		
		//FINDELEMENTS()
		//1
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(links.size());
		
		for (WebElement eles:links)
		{
			System.out.println(eles.getText());
			
		}
		//2
		
		
		
	
		
		
		
	}

}
