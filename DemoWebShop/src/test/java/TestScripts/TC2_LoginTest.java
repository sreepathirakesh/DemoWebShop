package TestScripts;

import TestUtils.TestBase;
import Testpages.HomePage;
import Testpages.LoginPage;

public class TC2_LoginTest extends TestBase {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		invokeBrowser();
		HomePage homePage=new HomePage(driver);
		homePage.clickLoginLink();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterloginEmail("rakeshs20@gmail.com");
		loginPage.enterloginPassword("admin123");
		loginPage.loginRememberMe();
		loginPage.loginForgotPassword();
		loginPage.loginButton();
		loginPage.loginRegisterBtn();
		System.out.println("---Login succesfully----");
	}

}
