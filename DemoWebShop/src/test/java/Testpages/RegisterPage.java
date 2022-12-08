package Testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	static WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		RegisterPage.driver=driver;
	}
	By gendermalerbtn=By.id("gender-male");
	By firstName=By.id("FirstName");
	By lastName=By.id("LastName");
	By email=By.id("Email");
	By pwd=By.id("Password");
	By confpwd=By.id("ConfirmPassword");
	By regiasterbtn=By.id("register-button");
	public void clickgenderMalebtn()
	{
		driver.findElement(gendermalerbtn).click();
	}
	public void enterFirstName(String fname)
	{
		driver.findElement(firstName).sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		driver.findElement(lastName).sendKeys(lname);
	}
	
	public void enterEmail(String email1)
	{
		driver.findElement(email).sendKeys(email1);
	}
	public void enterPassword(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	public void enterConfirmPwd(String confirmpwd)
	{
		driver.findElement(confpwd).sendKeys(confirmpwd);
	}
	public void registerButton()
	{
		driver.findElement(regiasterbtn).click();
	}

}
