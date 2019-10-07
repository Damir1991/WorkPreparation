package Steps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pages.homeAmazon;
import Utils.BaseClass;
import Utils.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazon extends BaseClass {

	public homeAmazon obj;
	
	@Given("I go to Amazon page")
	public void i_go_to_Amazon_page() throws Exception {
    obj=new homeAmazon();
   
    // local   homeAmazo obj = new homeAmazo
    
	}
	@Then("I verify Logo")
	public void i_verify_Logo() {
		CommonMethods.isElementDisplayed(obj.logo);
		String actualUrl=driver.getCurrentUrl();// get current url
		String expectedUrl="https://www.amazon.com/";
		  System.out.println("Compare 2 URL"+actualUrl+" is actual URL "+expectedUrl+" is expected URL ");
			CommonMethods.AssertElem(actualUrl, expectedUrl);
	}
	@Then("I click Best Sellers")
	public void i_click_Best_Sellers() {
		CommonMethods.click(obj.bestSellers);
	}
    
	@Then("I fail my URL")
	public void i_fail_my_URL() {
		String actualUrl=driver.getCurrentUrl();// get current url
		String expectedUrl="https://www.amazon.co";
		  System.out.println("Compare 2 URL"+actualUrl+" is actual URL "+expectedUrl+" is expected URL ");
			CommonMethods.AssertElem(actualUrl, expectedUrl);
	    
	}
	
	

	
		
		
//	 driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']")).isDisplayed();
		
	}

	

