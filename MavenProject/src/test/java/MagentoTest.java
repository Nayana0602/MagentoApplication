

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class MagentoTest 
{
	public void magento() 
	{
		String url="http://www.magento.com";
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	
		
		
		Home h= new Home(driver);
		h.clickOnMyAcc();
		
		Login l =new Login(driver);
		l.clickOnLogin();
		l.typeEmail("nitinmanjunath1991@gmail.com");
		l.typePassword("Welcome123");
		l.clickOnLogin();
		
		
		Logout l1 = new Logout(driver);
		l1.clickOnLogout();
		
		driver.quit();
		
		
		
		
		
		
	}
}

