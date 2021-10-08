package ToolTip_NewTap_MultipleWIndow_Size_location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTIp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip//");
		driver.switchTo().frame(0);
		
		WebElement text_box=driver.findElement(By.xpath("//input[@id='age']"));
		String titles=text_box.getAttribute("title");
		System.out.println("Attribure value is:,"+titles);
		driver.close();
		

	}

}
