package Alerts;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthitecatedPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		/*
		//syntax below
	    //driver.get("https://the-internet.herokuapp.com/basic_auth");  orrignal link
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		                  username passoword
*/
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
