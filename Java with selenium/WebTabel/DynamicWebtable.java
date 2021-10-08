package WebTabel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		
		// Login
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		// Click sales
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		//click orders
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		
		
		//1.find total number of pages in table
		String pages=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(pages);//Showing 1 to 20 of 9080 (454 Pages)


		int total_pages=Integer.valueOf(pages.substring(pages.indexOf("(")+1,pages.indexOf("Pages")-1));// inbult function mula nama ithu use pandrom
		System.out.println("Total number of pages:"+total_pages);	 // ithu vanthu currenta evlo pages irkum nu display agum
		
		
		for(int p=1;p<=5;p++) // oru 5 page ku varaikum set pandrom
		{
			WebElement active_page=driver.findElement(By.xpath("//ul[@class=\"pagination\"]//li//span"));
			System.out.println("Active page:"+active_page.getText());
			active_page.click();  // active page number click pandrom
			
			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Number of rows:"+rows); // antha active page la irunthu rows evlo nu therinjukurom
			
			for (int r=1;r<=rows;r++)
			{
				String orderId=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();//

				String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
				// ipo kela if candtion ilama run panna 5 page la orderId,customerid,status ellam varum
				// so athunala na if condition use panni enaku vendiyatha choose pannikura
				if(status.equals("Pending"))
				{
					System.out.println(orderId+"   "+customer+"  "+status);
				}
						
				
				
				//System.out.println(orderId+"   "+customer+"  "+status); if condition ila nama ithuvea choose pannikalem
				
				
			}
			
			
			
			String pageno = Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class=\"pagination\"]//li//a[text()='"+pageno+"']")).click(); // next active ku porom
			
		
		}
		
		
		
		
		
		
		

	}

}
