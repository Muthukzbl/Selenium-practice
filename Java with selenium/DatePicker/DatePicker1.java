package DatePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		String month="July";
		String year="2021";
		String date="10";  
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		
		//select month and year
		while(true)
		{
			String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			 
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else
				driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		}
		
		
		
		//date selection
	    List<WebElement> alldates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement ele:alldates)
		{
			String dt=ele.getText();
			
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
		}

	}

}
