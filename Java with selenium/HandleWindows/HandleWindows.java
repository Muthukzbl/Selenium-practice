package HandleWindows;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		/*
		// Get WindowHandle()
		String windowId=driver.getWindowHandle();
		System.out.println(windowId);
		*/
		
		
		
		// Get WindowHandles
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowsID=driver.getWindowHandles();
		/*
		// 1. Iterator()
		Iterator<String> it=windowsID.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		System.out.println("Parent Window Id" +parentwindow);
		System.out.println("child Window Id" +childwindow);
		
		*/
		
		
		/*
		
		// 2. Using List/ArrayList
		List<String> windowsIdList=new ArrayList(windowsID); // inga vanthu Seta list convert pandrom
		String parentwindow=windowsIdList.get(0);
		String childwindow=windowsIdList.get(1);
		System.out.println("Parent Window Id" +parentwindow);
		System.out.println("child Window Id" +childwindow);
		
		*/
		
		
		/*
		
		
		// 3. How to use windows ID's for switching
		driver.switchTo().window(parentwindow);
		System.out.println("Parent window Id :" +driver.getTitle());
		
		driver.switchTo().window(childwindow);
		System.out.println("child window Id :" +driver.getTitle());
		
		*/
		
		/*
		
		
		// 4. For loop use panni  windows switch panni title print pandrom
		
		for (String win:windowsID) // nama en string nu vaikurom na becz nama string the read pandrom
		{
			String title=driver.switchTo().window(win).getTitle();
			System.out.println(title); 
		}
		
		*/
	
		//driver.close(); // close current windows
		//driver.quit();// closee all the broswer
		
		
		
		
		
		// 5. nama choose panni windows close pandrathu
		
		for (String win:windowsID) // nama en string nu vaikurom na becz nama string the read pandrom
		{
			String title=driver.switchTo().window(win).getTitle();
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
		
		
		
		
		
		
	}

}
