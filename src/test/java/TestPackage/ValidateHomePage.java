package TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.InmarsatLandingPage;
import resources.base;

public class ValidateHomePage extends base {
	
	@BeforeTest
	public void preconditions() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
@Test 
	public void basePageNavigation(String Firstname, String Lastname) throws IOException {	
	
	
	InmarsatLandingPage l = new InmarsatLandingPage(driver);
	Assert.assertTrue(l.ClickContact().isDisplayed());
	Assert.assertEquals("Partner Search", l.VerifyHomePageText().getText());

}

@AfterTest
public void teardown() {
	
	driver.close();
}



}
