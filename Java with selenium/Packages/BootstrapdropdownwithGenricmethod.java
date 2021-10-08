package Packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapdropdownwithGenricmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> drpdown=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println(drpdown.size());	
		selectoptions(drpdown,"Accounts");
		/*for (WebElement ptye:drpdown) // idpium use panlem
		{
			if (ptye.getText().equals("Accounts"))
			{
				ptye.click();
				break;
			}
		} */
		

	} 
	
	public static void selectoptions(List<WebElement> options, String value) // ipdium use panlem
	{
		for (WebElement ptye:options) 
		{
			if (ptye.getText().equals(value))
			{
				ptye.click();
				break;
			}
		}
		
	}

}
