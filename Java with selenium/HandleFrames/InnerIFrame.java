package HandleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		WebElement outter=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outter);
		
		//iframe[@src='MultipleFrames.html']

		WebElement inner=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(inner);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");		
		
		
		
			

	}

}
