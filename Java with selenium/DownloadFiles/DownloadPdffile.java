package DownloadFiles;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadPdffile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location=System.getProperty("user.dir")+"\\Downloads\\";
		
		
		//Chrome
		
		HashMap preferences=new HashMap();
		preferences.put("plugins.always_open_pdf_externally",true); //for pdf download
		preferences.put("download.default_directory",location);
			
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs",preferences);
		
		
		
		/**
		// Edge

		HashMap preferences=new HashMap();
		preferences.put("plugins.always_open_pdf_externally",true); //for pdf download
		preferences.put("download.default_directory",location);
			
		EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("prefs",preferences);
		 
		**/
		
		
		/**
		//FireFox
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setpreference("pdfjs.disabled", true);
		profile.setpreference("browser.helperApps.neverAsk.saveToDisk","application/pdf"); //key value mathiri ,
																							   // mime type
		
		profile.setPreference("browser.download.folderList",2); //0 - desktop , 1 - download , 2 - desired location
		profile.setPreference("browser.download.dir",location);
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		**/
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver 90\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);	
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();

	}

}
