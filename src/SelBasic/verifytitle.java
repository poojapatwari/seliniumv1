package SelBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class verifytitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajinkya\\Desktop\\manual testing notes\\Projects\\auto\\Drivers\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//verify the title
		String ExpTitle="Facebook – log in or sign up";
		String ActTitle=driver.getTitle();
		System.out.println(ActTitle);
		if(ActTitle.equals(ExpTitle))
		{
			System.out.println("Title Matched-TestCase Pass");
		}
		else
		{
			System.out.println("Title not Match-TestCase Fail");
		}
             driver.close();
	}
	

}
