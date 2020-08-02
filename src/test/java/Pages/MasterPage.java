package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MasterPage {

	static WebDriver driver;
	
public MasterPage(WebDriver driver) {
		
		this.driver=driver;
	}




public void click(String locator) {
	
	
	if(locator.contains("xpath")) {
	driver.findElement(By.xpath(locator.split(":")[1])).click();}
	
	if(locator.contains("name")) {
		driver.findElement(By.name(locator.split(":")[1])).click();}
	
	if(locator.contains("id")) {
		driver.findElement(By.id(locator.split(":")[1])).click();}
	
	if(locator.contains("linktext")) {
		driver.findElement(By.linkText(locator.split(":")[1])).click();}
	
	if(locator.contains("css")) {
		driver.findElement(By.cssSelector(locator.split(":")[1])).click();}
	
	
}

public void type(String locator, String text) {
	
	
	if(locator.contains("xpath")) {
	driver.findElement(By.xpath(locator.split(":")[1])).sendKeys(text);}
	
	if(locator.contains("name")) {
		driver.findElement(By.name(locator.split(":")[1])).sendKeys(text);}
	
	if(locator.contains("id")) {
		driver.findElement(By.id(locator.split(":")[1])).sendKeys(text);}
	
	
	
	
}

public String getText(String locator) {
	
	
	if(locator.contains("xpath")) {
	return driver.findElement(By.xpath(locator.split(":")[1])).getText();}
	
	if(locator.contains("name")) {
		return driver.findElement(By.name(locator.split(":")[1])).getText();}
	
	if(locator.contains("id")) {
		return driver.findElement(By.id(locator.split(":")[1])).getText();}
	
	return null;
	
}	

public void select(String locator,String text) {
	
	if(locator.contains("xpath")) {
		WebElement element= driver.findElement(By.xpath(locator.split(":")[1]));
		Select select= new Select(element);
		select.selectByVisibleText(text);}
	
	if(locator.contains("name")) {
		WebElement element= driver.findElement(By.name(locator.split(":")[1]));
		Select select= new Select(element);
		select.selectByVisibleText(text);
		}
	
	if(locator.contains("id")) {
		WebElement element= driver.findElement(By.id(locator.split(":")[1]));
		Select select= new Select(element);
		select.selectByVisibleText(text);
	
	
	
	
	}
	
	
}

public void dismissAlert() {
	
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	
}

public void exWait(String locator, int time) {
	
	if(locator.contains("xpath")) {
	WebDriverWait explicitWait = new WebDriverWait(driver,time);
	
	explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator.split(":")[1])));}
	
	
	if(locator.contains("name")) {
		WebDriverWait explicitWait = new WebDriverWait(driver,time);
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator.split(":")[1])));}
	
	if(locator.contains("id")) {
		WebDriverWait explicitWait = new WebDriverWait(driver,time);
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator.split(":")[1])));}
	
	
	
}



public void alert(String locator) {
	
Actions action = new Actions(driver);

}











	
	
}

















