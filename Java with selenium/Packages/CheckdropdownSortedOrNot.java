package Packages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckdropdownSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10); doubt iruku.
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.manage().window().maximize();
		
		WebElement drpdown=driver.findElement(By.name("category_id"));
		Select drpselect=new Select(drpdown);
		List<WebElement>options=drpselect.getOptions();
		
		ArrayList orignallist=new ArrayList();
		ArrayList templist=new ArrayList();
		
		for (WebElement option:options)
		{
			orignallist.add(option.getText());
			templist.add(option.getText());
			
		}
		System.out.println("orignal list :-"+orignallist);
		System.out.println("templist :-"+templist);
		Collections.sort(templist); // sorted

		System.out.println("orignal list :-"+orignallist);
		System.out.println("templist after sorting :-"+templist);
		
		if(orignallist.equals(templist))
		{
			System.out.println("Dropdown sorted");
			
		}
		else
		{
			System.out.println("Dropdown unsorted");
			
		}
		
		driver.close();
		

	}

}
