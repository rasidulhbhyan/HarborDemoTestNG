package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage{	
	
	String goToSignInPage="xpath://a[@class='login']";
	
	String goToBlousePage="linktext:Blouse";
	
	String movingElement= "xpath://li[4]//div[1]//p[2]//button[1]";

	

	
public HomePage(WebDriver driver) {
		
		super(driver);
	}
	


public void goToAuthenticationPage() {
	
	click(goToSignInPage);
	
}
	
public void goToBlousePage() {
	
	click(goToBlousePage);
	
}	

public void waitForElement() {
	
	
	exWait(movingElement,30);
	click(movingElement);
	
	
}
	




















}
