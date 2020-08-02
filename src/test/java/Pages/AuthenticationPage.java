package Pages;

import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends MasterPage{

	String pageTitle="xpath://h1[@class='page-heading']";
	
	String registerEmailBox= "id:email_create";
	String createAccountBox= "xpath://span[text()[normalize-space()='Create an account']]";
	
	String firstNameInfoBox="name:customer_firstname";
	String lastNameInfoBox="name:customer_lastname";
	String passwordBox= "id:passwd";
	
	String addressFirstNameBox="css:firstname";
	String addressLastNameBox="name:lastname";
	String addressBox= "id:address1";
	String cityBox= "id:city";
	String stateBox ="id:id_state";
	String zipCodeBox="id:postcode";
	String phoneNumberBox= "id:phone_mobile";
	String registerButton="xpath://span[contains(text(),'Register')]";
	
	
	
public AuthenticationPage(WebDriver driver) {
		super(driver);
	
	}

	
	
public String getPageTitle() {
	return getText(pageTitle);
	

}
	
public void registerNewUser(String newEmail) {
	
	exWait(registerEmailBox,4);
	type(registerEmailBox,newEmail);
	
	exWait(createAccountBox,4);
	click(createAccountBox);
	
	type(firstNameInfoBox,"John");
	type(lastNameInfoBox,"Washington");
	type(passwordBox,"password");
	
    type(addressFirstNameBox,"John");
    type(addressLastNameBox,"Washington");
    type(addressBox,"11432");
    type(cityBox,"jamacia");
    select(stateBox,"New York");
    type(zipCodeBox,"11432");
    type(phoneNumberBox,"7189999999");
    click(registerButton);
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
