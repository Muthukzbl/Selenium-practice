package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;



	
public class HandleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement dropdownele=driver.findElement(By.id("input-country"));
		Select drpdwn=new Select(dropdownele);
		//drpdwn.selectByIndex(1);
		//drpdwn.selectByValue("10");
		//drpdwn.selectByVisibleText("Denmark");
		
		
		//Selecting option from dropdown without using methods
		
		List<WebElement> alloption =drpdwn.getOptions();
		
		for(WebElement option:alloption)
		{
			if(option.getText().equals("cuba"))
			{
				option.click();
				break;
			}
			}
		driver.close();
		}
		
		

	}



