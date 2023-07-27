package SelBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Ajinkya\\Desktop\\manual testing notes\\Projects\\auto\\Drivers\\msedgedriver.exe");
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.close();
		

	}

}
