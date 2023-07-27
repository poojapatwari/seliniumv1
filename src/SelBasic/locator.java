package SelBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajinkya\\Desktop\\manual testing notes\\Projects\\auto\\Drivers\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//find the webelements
		//Id
		WebElement txtbox=driver.findElement(By.id("email"));
		txtbox.sendKeys("abc@gmail.com");
		//Locator name()
		WebElement passbox=driver.findElement(By.name("pass"));
		passbox.sendKeys("abc123");
		Thread.sleep(3000);
		//locator Tagname()
		WebElement button=driver.findElement(By.tagName("button"));
		button.click();
		Thread.sleep(3000);
		//locator LinkText()
		//WebElement forgotten=driver.findElement(By.linkText("Forgotten password?"));
		//forgotten.click();
		//locator PartiallinkedText()
		WebElement Forgot=driver.findElement(By.partialLinkText("password"));
		Forgot.click();
		Thread.sleep(5000);
		driver.close();

	}

}
