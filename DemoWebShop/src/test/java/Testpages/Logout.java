package Testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	static WebDriver driver;
	public Logout(WebDriver driver)
	{
		Logout.driver=driver;
	}
	By logoutlink=By.cssSelector("ul li a.ico-logout");
	public void clickLogoutLink()
	{
		driver.findElement(logoutlink).click();
	}

}
