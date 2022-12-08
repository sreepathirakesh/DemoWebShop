package TestScripts;

import TestUtils.TestBase;
import Testpages.HomePage;
import Testpages.Logout;
import Testpages.RegisterPage;

public class TC1_RegisterTest extends TestBase{
	
	

	 static String homePageTitle;
	 static String registerPageTitle;
	 static String registerSuccessTitle;
	 static String logoutPageTitle;

	public static void main(String[] args) {
		
		invokeBrowser();
		HomePage homePage=new HomePage(driver);
		homePage.clickRegisterLink();
		homePageTitle = driver.getTitle();
		if(homePageTitle.contains("Demo Web Shop"))
		{
			System.out.println("..........Homepage found successfully..........");
		}else{
			System.out.println(".....Home page Not founf>>>...");
			System.exit(0);
		}
		
				
		RegisterPage registerPage=new RegisterPage(driver);
		registerPageTitle = driver.getTitle();
		if(registerPageTitle.contains("Demo Web Shop. Register"))
		{
			System.out.println("..........Register found successfully..........");
		}else{
			System.out.println("....RegisterPage Not founf>>>...");
			System.exit(0);
		}
		
		registerPage.clickgenderMalebtn();
		registerPage.enterFirstName("rakesh");
		registerPage.enterLastName("sreepathi");
		registerPage.enterEmail("rakeshs30@gmail.com");
		registerPage.enterPassword("admin123");
		registerPage.enterConfirmPwd("admin123");
		registerPage.registerButton();
		/*registerSuccessTitle = driver.get(url);
		if(registerSuccessTitle.contains("Demo Web Shop. Register"))
		{
			System.out.println("..........RegisterSuccessPage found successfully..........");
		}else{
			System.out.println("....RegisterSuccessPage Not founf>>>...");
			System.exit(0);
		}*/
		Logout logoutPage=new Logout(driver);
		logoutPage.clickLogoutLink();
		logoutPageTitle=driver.getTitle();
		if(logoutPageTitle.contains("Demo Web Shop"))
		{
			System.out.println("..........logoutpage found successfully..........");
		}else{
			System.out.println(".....Logout page Not founf>>>...");
			System.exit(0);
		}
		
	}

}
