package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class homeAmazon extends BaseClass {

	@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")
	public WebElement logo;
	
	@FindBy(xpath="//a[@tabindex='47']")
	public WebElement bestSellers;
	

public homeAmazon() {
	PageFactory.initElements(driver, this);
}


}