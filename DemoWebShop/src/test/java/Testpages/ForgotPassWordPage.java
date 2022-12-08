package Testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassWordPage {
	
	static WebDriver driver;
	public ForgotPassWordPage(WebDriver driver)
	{
		//LoginPage.driver=driver;
		ForgotPassWordPage.driver=driver;
	}
	By forgotpasswordemail=By.xpath("//input[@class='email']");
	By forgotpasswordRecoverbtn=By.xpath("//input[@name='send-email']");
	
	public void enterForgotPasswordEmail(String femail)
	{
		driver.findElement(forgotpasswordemail).sendKeys(femail);
		//driver.findElement(forgotpasswordemail).sendKeys(femail);
	}
	public void submitRecoverybtn()
	{
		driver.findElement(forgotpasswordRecoverbtn).click();
	}

}
