package KeyboardActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		

		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		

		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		
		

	}

}
