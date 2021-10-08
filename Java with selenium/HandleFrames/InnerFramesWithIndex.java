package HandleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFramesWithIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		System.out.println("Text Present in tdriver" +driver.findElement(By.xpath("//h1[normalize-space()='This page is displayed in an iframe']")).getText());
		driver.switchTo().parentFrame(); // go to parent frame
		String text=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
		System.out.println("Text Present in tdriver" +text);	
		
		
		
		driver.close();

	}

}
