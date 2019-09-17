package Steps;

import Utils.BaseClass;
import cucumber.api.java.en.Given;

public class Amazon extends BaseClass {

	@Given("I go to Amazon page")
	public void i_go_to_Amazon_page() throws InterruptedException {
	   
	    
		SetUp();
		
		BaseClass obj = new BaseClass();
		obj.CloseBrowser();
		
	}

	
}
