package SelBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S1 {
	//Sample Program
	public static void main(String [] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajinkya\\Desktop\\manual testing notes\\Projects\\auto\\Drivers\\chromedriver.exe");
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
     WebDriver driver=new ChromeDriver(options);
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/login/");
     driver.close();
     
}
}