package Packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDown {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//WebElement dropdownele=driver.findElement(By.id("input-country"));
		
		WebElement Noofemp=driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
		selectOptionFromDropdown(Noofemp,"16 - 20");
		

		WebElement industry=driver.findElement(By.id("Form_submitForm_Industry"));
		selectOptionFromDropdown(industry,"Aerospace");

		WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
		selectOptionFromDropdown(country,"Albania");
		

	}
	
	public static void selectOptionFromDropdown(WebElement ele, String value)
	{
		Select drp=new Select(ele);
		List<WebElement>alloptions=drp.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
		
	}

}
