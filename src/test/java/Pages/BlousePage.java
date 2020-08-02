package Pages;

import org.openqa.selenium.WebDriver;

public class BlousePage extends MasterPage {

	String sizeSelect= "name:group_1";
	String addToCartButton="xpath://span[contains(text(),'Add to cart')]";
	String closePopUp= "xpath://span[@class='cross']";
	
	String productAddedText= "xpath://div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]";
	
	String goToCartPage="xpath://b[contains(text(),'Cart')]";
	
	
	
public BlousePage(WebDriver driver) {
		super(driver);
		
	}

public void goToCartPage() {
	
	click(goToCartPage);
	
	
	
	
}



public void addBlouseToCart(String text) {
	
	
	select(sizeSelect,text);
	click(addToCartButton);
	click(closePopUp);
	

}

public String getProductAddedText() {
	exWait(productAddedText,5);
	return getText(productAddedText);
	
}



}
