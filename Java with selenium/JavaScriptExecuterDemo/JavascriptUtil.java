package JavaScriptExecuterDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {
	
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
		
	}
	
	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title =js.executeScript("return document.title;").toString();
		return title;
		
	}
	
	
	public static void ClickElementByJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);
		
	}
	
	public static void generateAlert(WebDriver driver, String message)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"  + message + "')");
		
	}
	
	public static void refreshBrowserByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
		
	}
	
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void scrollPageUp(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}
	
	public static void ZoompageByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("document.body.style.zoom='1000%'");
		
	}
	
	public static void flash(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<50;i++)
		{
			changeColor("#000000",element,driver);

			changeColor(bgcolor,element,driver);
		}
		
	}
	
	
	public static void changeColor(String color, WebElement element ,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		
		try {
			Thread.sleep(20);
			
		}
		catch (InterruptedException e)
		{
			
		}
	}
	
	
	
}
