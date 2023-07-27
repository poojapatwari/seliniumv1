package SelBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajinkya\\Desktop\\manual testing notes\\Projects\\auto\\Drivers\\chromedriver.exe");
	     ChromeOptions option=new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(option);
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     //find the multiple webelement
	     List<WebElement> elelist=driver.findElements(By.tagName("input"));
	     System.out.println(elelist.size());
	     //itrate
	     for(WebElement ele:elelist)
	     {
	    	 System.out.println(ele.getTagName());
	     }
	     Thread.sleep(2000);
	     driver.close();
	}

}
