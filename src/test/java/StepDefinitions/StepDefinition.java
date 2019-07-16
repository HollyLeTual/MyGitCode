package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.InmarsatContactUs;
import pageobjects.InmarsatLandingPage;
import resources.base;

import org.junit.runner.RunWith;
//import org.testng.Assert;

@RunWith(Cucumber.class)
public class StepDefinition extends base {
	
	
	
   @Given("^Initialize the browser with Chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	
    	driver = initializeDriver();
    			}
    	
    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	    	
    	    	driver.get(strArg1);
    	       
    	    }

    @And("^Click on Contact Us button$")
    public void click_on_contact_us_button() throws Throwable {
    	
    	InmarsatLandingPage l = new InmarsatLandingPage(driver);
        l.ClickContact().click();
    
    }

    @When("^User enters (.+) and (.+) and submits$")
    public void user_enters_and_and_submits(String firstname, String lastname) throws Throwable {
        
    	 InmarsatContactUs c = new InmarsatContactUs(driver);
    	    c.ProvideFName().sendKeys(firstname);
    	    c.ProvideLName().sendKeys(lastname);
    }


    @Then("^Verfiy the Send Request Button$")
    public void verfiy_the_send_request_button() throws Throwable {     
    }

    //InmarsatContactUs c = new InmarsatContactUs(driver);
    //Assert.assertTrue(c.ClickSubmit().isDisplayed());
        
//}
}
