package Pages;

import org.openqa.selenium.WebDriver;

public class CartPage extends MasterPage{

	String removeItem="xpath://i[@class='icon-trash']";
	
	String emptyCartWarning="xpath://p[@class='alert alert-warning']";
	
	
	
public CartPage(WebDriver driver) {
		super(driver);
		
	}



public void removeItemFromCart() {
	
	click(removeItem);
	

	
}

public String getEmptyCartText() {
	
	exWait(emptyCartWarning,5);
	return getText(emptyCartWarning);
	
}
















}

