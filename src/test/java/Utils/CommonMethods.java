package Utils;

import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class CommonMethods {
	
	public static void click(WebElement elem) {
		
		elem.click();
		
	}
	
	public static void AssertElem(String actual, String expected) {
	  Assert.assertEquals(expected, actual);
	}
	
	public static void isElementDisplayed(WebElement elem) {
		elem.isDisplayed();
	}

}
