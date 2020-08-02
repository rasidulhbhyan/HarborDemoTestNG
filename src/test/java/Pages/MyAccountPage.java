package Pages;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends MasterPage{

	String nameDisplayedBox="xpath://a[@class='account']";
	
public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}

	
public String getUserName() {
	
	return getText(nameDisplayedBox);
}	
	
	
	
	
}
