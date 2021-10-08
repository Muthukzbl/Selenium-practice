package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// 1. capture cookies from browser
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Total no of cookies:"+cookies.size());  // 4
		
		//2.How to print cookies from browser
		for (Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+" ----- "+cookie.getValue());
		}
		
		

		// 3. Add cookie from browser
		Cookie cookieobj=new Cookie("Mycookie123","123455");
		driver.manage().addCookie(cookieobj); // 5 coookies varum
		
		cookies=driver.manage().getCookies();
		System.out.println("After add Now Total no of cookies:"+cookies.size());
		
		for (Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+" ----- "+cookie.getValue());
		}
		
		
		//4.How to delete  specfic  cookies with object
		
		driver.manage().deleteCookie(cookieobj);
		cookies=driver.manage().getCookies();
		System.out.println("After detele specfic cookies Now Total no of cookies:"+cookies.size()); // deelete pannathu nala ipo 4 cookie irukum
		
		//5.how to delete all cookies 
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("After delete All cookies Now Total no of cookies:"+cookies.size());
		
	}

}
