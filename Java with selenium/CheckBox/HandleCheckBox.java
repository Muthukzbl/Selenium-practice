package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		/*
		//1.Select Specific text box
		driver.findElement(By.id("monday")).click();
		*/
	//----------------------------------------------------------------------------------
		
		//2.Select all the check box
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("total no of text boxes" + checkboxes.size());
		/*
		//-- using for loop
		for (int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		//  above loop or this loop use panlem
		/*
		for(WebElement option:checkboxes)
		{
			option.click();
		}
		*/
		//----------------------------------------------------------------------
		
		
		/*
		//3.Select multiple check box by choice
		for(WebElement option:checkboxes)
		{
			String chkbox=option.getAttribute("id");
			if (chkbox.equals("monday") || chkbox.equals("sunday"))
			{
				option.click();
				
			}
					
		
		}
		*/
		
		
		
		
		/*
		//4.Select Last 2 check boxes
		
		int totalcheckbox=checkboxes.size();
		for(int i=totalcheckbox-2;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
		}
		*/
		
		
		
		
		//5.Select first 2 check boxes
		for(int i=0;i<checkboxes.size();i++)
		{
			if(i<2)
			{
				checkboxes.get(i).click();	
				}
		}
		

	}

}
