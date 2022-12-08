package TestScripts;

import TestUtils.TestBase;
import Testpages.ForgotPassWordPage;
import Testpages.HomePage;
import Testpages.LoginPage;

public class TC3_ForgotPasswordTest extends TestBase {

	public static void main(String[] args) {
		invokeBrowser();
		HomePage homePage=new HomePage(driver);
		homePage.clickLoginLink();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginForgotPassword();
		ForgotPassWordPage forgotpasswordpPage=new ForgotPassWordPage(driver);
		System.out.println("hello........");
		forgotpasswordpPage.enterForgotPasswordEmail("rakeshs20@gmail.com");
		
		forgotpasswordpPage.submitRecoverybtn();
		

	}

}
