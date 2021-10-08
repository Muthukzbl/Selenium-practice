package WebTabel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		
		// 1. Find total number of coloumn and rows in tablel
		int rows=driver.findElements(By.xpath("//table[@class='data-list']//tbody//tr")).size();
		System.out.println("Total no of rows in tabel"+rows);
		
		int column=driver.findElements(By.xpath("//table[@class='data-list']//thead//th")).size();
		System.out.println("Total no of coloumn "+column);
		
		
		 /*
		
		//2.To find specfic rew/coloumn data
		String specficdata=driver.findElement(By.xpath("//table[@class='data-list']//tbody//tr[2]//td[1]")).getText();
		System.out.println(specficdata); // answer vanthu java nu varum
		
		*/
		
		
		
		
		/*
		//3.Retrive tha all data from tabel
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=column;c++)
			{
				String data=driver.findElement(By.xpath("//table[@class='data-list']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"       ");				
			}
			System.out.println();
			
		}
		*/
		
		
		
		
		//4.Print Release date and version no java language of selenium
		for(int r=1;r<=rows;r++)
		{
			String language=driver.findElement(By.xpath("//table[@class='data-list']//tbody//tr["+r+"]//td[1]")).getText();	
			if (language.equals("Java"))
			{
				String version=driver.findElement(By.xpath("//table[@class='data-list']//tbody//tr["+r+"]//td[2]")).getText();
				String releasedate=driver.findElement(By.xpath("//table[@class='data-list']//tbody//tr["+r+"]//td[3]")).getText();
				System.out.println(language + "" +version + "" +releasedate );
					
				
			}
		}
		driver.close();
		
		
		
		}

}
