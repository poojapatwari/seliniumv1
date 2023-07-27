package SelBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajinkya\\Desktop\\manual testing notes\\Projects\\auto\\Drivers\\chromedriver.exe");
     ChromeOptions option=new ChromeOptions();
     option.addArguments("--remote-allow-origins=*");
     WebDriver driver=new ChromeDriver(option);
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     //CssSelector 1]Using tagname & id
     //WebElement textbox=driver.findElement(By.cssSelector("input#email"));
     //textbox.sendKeys("abc@gmail.com");
     //CssSelector 2]using tagname.classname
     WebElement txtbox=driver.findElement(By.cssSelector("input[name='email']"));
     txtbox.sendKeys("avc@gmail.com");
	}

}
