package TestScripts;

import TestUtils.TestBase;
import Testpages.HomePage;

public class TC5_WishListTest extends TestBase {

	public static void main(String[] args) {
		
		
		invokeBrowser();
		HomePage homePage=new HomePage(driver);
		homePage.clickWishList();
		
	}

	}


