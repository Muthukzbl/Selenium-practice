package Brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int brokenLinks=0;
		
		for(WebElement element:links)
		{
			String url =element.getAttribute("href");
			if(url==null  || url.isEmpty())
			{
				System.out.println("Url is empty");
				continue;
				
			}
			URL link = new URL(url);  // ithu vanthu string URL la "URL" ku convert pannatha nama HTTPURLconnection use panna mudium
			try {
				HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>=400)
				{
					System.out.println(httpconn.getResponseCode()+url+" is"+"  Broken links");
					brokenLinks++;
				}
				else
				{

					System.out.println(httpconn.getResponseCode()+url+" is"+"  Valid links");
					
				}
				
				
			} catch (Exception e)
			{
				
			
			}
			}
		
		System.out.println("Total number of broken list "+ brokenLinks);
		driver.quit();
		
	}

}
