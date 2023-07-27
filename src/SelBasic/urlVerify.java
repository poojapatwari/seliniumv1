package SelBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class urlVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajinkya\\Desktop\\manual testing notes\\Projects\\auto\\Drivers\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String ActURl="www.Facebook.com";
		String ExpURL=driver.getCurrentUrl();
		System.out.println(ExpURL);
		
		if(ExpURL.equals(ActURl))
		{
			System.out.println("URl Matched-TestCase Pass");
		}
		else
		{
			System.out.println("Url is not Matched-TestCase Fail");
		}
     driver.close();		

	}

}
