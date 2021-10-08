package Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement min=driver.findElement(By.xpath("//span[1]"));
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(min, 100, 0).perform();
		//act.dragAndDropBy(button, -100, 0).perform(); ithu vanthu again palayea place ku pogum
		System.out.println("Location of the slider"+min.getLocation());
		System.out.println("Height and widht of the slider"+min.getSize());
		
		WebElement max=driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(max,-100, 0).perform();
		System.out.println("Location of the slider"+max.getLocation());
		System.out.println("Height and widht of the slider"+max.getSize());

	}

}
