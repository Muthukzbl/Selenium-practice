	package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteGooglePlaceGround {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.twoplugs.com/");
		WebElement button=driver.findElement(By.xpath("//a[text()='Live Posting']"));
		button.click();
		WebElement textbox=driver.findElement(By.id("autocomplete"));
		textbox.clear();
		textbox.sendKeys("New York, FL, United States");
		Thread.sleep(3000);
		
		String Text;
		do                 //// intha code vanthu  drop down hela onu onu poi select agum.
		{
			textbox.sendKeys(Keys.ARROW_DOWN);
			Text=textbox.getAttribute("value");
			if(Text.equals("New York, FL, United States"))
			{
				
				textbox.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
				
			}while(!Text.isEmpty());
		
		
		
			
		}
			
	
		
}


