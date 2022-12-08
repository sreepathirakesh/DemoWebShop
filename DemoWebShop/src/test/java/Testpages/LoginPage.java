package Testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	static WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		LoginPage.driver=driver;
	}
	By loginemail=By.id("Email");
	By loginpwd=By.id("Password");
	By loginremebrme=By.name("RememberMe");
	By loginforgotpassword=By.xpath("//a[@href='/passwordrecovery']");
	By loginButton=By.xpath("//input[@class='button-1 login-button']");
	By loginregisterbtn=By.xpath("//input[@class='button-1 register-button']");
	public void enterloginEmail(String lemail)
	{
		driver.findElement(loginemail).sendKeys(lemail);
	}
	public void enterloginPassword(String lpwd)
	{
		driver.findElement(loginpwd).sendKeys(lpwd);
	}
	public void loginRememberMe()
	{
		driver.findElement(loginremebrme).click();
	}
	public void loginForgotPassword()
	{
		driver.findElement(loginforgotpassword).click();
	}
	
	public void loginButton() {
		driver.findElement(loginButton).click();
	}
	public void loginRegisterBtn()
	{
		driver.findElement(loginregisterbtn).click();
	}
	

}
