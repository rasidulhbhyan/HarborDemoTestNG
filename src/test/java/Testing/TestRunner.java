package Testing;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AuthenticationPage;
import Pages.BlousePage;
import Pages.CartPage;
import Pages.HomePage;
import Pages.MyAccountPage;

public class TestRunner extends TestBase {

	

@Test
public void goToAuthenticationPage() {
	
	
	startBrowser("firefox");
	HomePage homePage= new HomePage(driver);
	
	homePage.goToAuthenticationPage();
	impliciteWait(10);
	AuthenticationPage authPage= new AuthenticationPage(driver);
	
	String displayedTitle = authPage.getPageTitle();
	
	Assert.assertEquals(displayedTitle, "AUTHENTICATION");
	
}	


@Test
public void addBlouseToCart() {
	
	
	startBrowser("chrome");
	HomePage homePage= new HomePage(driver);
	impliciteWait(10);
	homePage.goToBlousePage();
	
	BlousePage blousePage= new BlousePage(driver);
	blousePage.addBlouseToCart("M");
	
	String dispalyedMessage= blousePage.getProductAddedText();
	
	Assert.assertEquals(dispalyedMessage, "Product successfully added to your shopping cart");
	
}


@Test
public void removeBlouseToCart() {
	
	
	startBrowser("chrome");
	HomePage homePage= new HomePage(driver);
	impliciteWait(10);
	homePage.goToBlousePage();
	
	BlousePage blousePage= new BlousePage(driver);
	blousePage.addBlouseToCart("M");
	blousePage.goToCartPage();
	
	CartPage cartPage= new CartPage(driver);
	cartPage.removeItemFromCart();
	
    String displayedAlertText = cartPage.getEmptyCartText();
	
	Assert.assertEquals(displayedAlertText, "Your shopping cart is empty.");
	
	
	
	
}


@Test
public void registerNewUser() {
	
	
	startBrowser("firefox");
	HomePage homePage= new HomePage(driver);
	
	homePage.goToAuthenticationPage();

	AuthenticationPage authPage= new AuthenticationPage(driver);
	
	    Random rand = new Random(); 
	    int randomInt = rand.nextInt(100000); 
	
	authPage.registerNewUser("adarwrew"+randomInt+"@gmail.com");
	
	MyAccountPage myAccountPage= new MyAccountPage(driver);
	String nameDisplayed=myAccountPage.getUserName();
	Assert.assertEquals(nameDisplayed, "Jonn Washington");
	
	
}


@Test
public void movingElement() {
	
	
	startBrowser("firefox");
	HomePage homePage= new HomePage(driver);
	homePage.waitForElement();
	
	
	
}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
