package Steps;



import Utils.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before 
	public void start(Scenario scenario) throws InterruptedException, Exception {
		BaseClass.SetUp();
		System.out.println("Starting test:"+scenario.getName());
	}

	@After
	public void end(Scenario scenario) {

		System.out.println("Ending test:"+scenario.getName()+"  Scenario Status is: "+scenario.getStatus());
		
//		if (scenario.isFailed()) {
//			byte [] shot=CommonMethods.takeScreenshot();
//			scenario.embed(shot, "image/png");
//		}
		
		BaseClass.CloseBrowser();
	}
	
	
}
