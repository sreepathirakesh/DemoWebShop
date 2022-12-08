package Testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
static WebDriver driver;

public HomePage(WebDriver driver)
{
	HomePage.driver=driver;
}
By registerlink=By.cssSelector("ul li a.ico-register");
public void clickRegisterLink()
{
	driver.findElement(registerlink).click();
}

By loginlink=By.xpath("//a[@class='ico-login']");
public void clickLoginLink()
{
	driver.findElement(loginlink).click();
}
By shoppingCart=By.xpath("//span[@class='cart-label']");
public void clickShoppingCart()
{
	driver.findElement(shoppingCart).click();
}
By wishList=By.xpath("//span[@class='wishlist-qty']");
public void  clickWishList()
{
	driver.findElement(wishList).click();
}


}


