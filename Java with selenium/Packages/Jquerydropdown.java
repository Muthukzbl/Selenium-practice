package Packages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquerydropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10); doubt iruku.
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		//selectChoiceValues(driver,"choice 1");
		//selectChoiceValues(driver,"choice 1","choice 2 3","choice 6");
		selectChoiceValues(driver,"all");
		//driver.close();
		
		

	}
	
	public static void selectChoiceValues(WebDriver driver,String... value)
	{
		List<WebElement> choicelist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choicelist)
			{
				String text=item.getText();
				
				for(String val:value)
				{
					if (text.equals(val))
					{
						item.click();
						break;
					}

				}
			}
				
		}
		else
		{
			try
			{
				for(WebElement item:choicelist)
				{
					item.click();
				}
			}
			catch(Exception e)
			{
				
			}
		}
	}
	

}
