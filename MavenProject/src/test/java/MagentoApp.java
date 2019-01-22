package test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import main.java.Home;
import main.java.Login;
import main.java.Logout;

public class MagentoApp 
{
	public static void main(String [] args)
	{
		String url = "http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		Home h = new Home(driver);
		h.clickOnMyAcc();
		
		Login l1 = new Login(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		l1.typePassword("Welcome123");
		l1.clickOnLogin();
		
		Logout l2 = new Logout(driver);
		l2.clickOnLogout();
		
		driver.quite();
	}

}
