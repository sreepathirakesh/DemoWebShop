package TestScripts;

import TestUtils.TestBase;
import Testpages.HomePage;

public class TC4_ShoppingCartTest extends TestBase {
	public static void main(String args[])
	{
	
	invokeBrowser();
	HomePage homePage=new HomePage(driver);
	homePage.clickShoppingCart();
	
}
}
