package TestPackage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.InmarsatContactUs;
import pageobjects.InmarsatLandingPage;
import resources.base;

public class QTTTestCase extends base {
	
	@BeforeTest
	public void preConditions() throws IOException {
		driver = initializeDriver();
				
	}
	
	@Test (dataProvider="getData")
	
	public void basePageNavigation(String Firstname, String Lastname) throws IOException {	
	
	driver.get(prop.getProperty("url"));
	InmarsatLandingPage l = new InmarsatLandingPage(driver);
    l.ClickContact().click();
	
    InmarsatContactUs c = new InmarsatContactUs(driver);
    c.ProvideFName().sendKeys(Firstname);
    c.ProvideLName().sendKeys(Lastname);
    //c.ClickSubmit().click();
    log1.info("Successfully entered first name and last name");
    
       
}

	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
	
	
	@DataProvider
	
	public Object[][] getData() {
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "test1";
		data[0][1] = "test2";
		
		data[1][0] = "test3";
		data[1][1] = "test4";
		
		return data;		
		
		
	}	
	
}