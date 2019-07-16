package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InmarsatContactUs {
	
	
	public WebDriver driver;
	
	By FirstName = By.xpath("//input[@id='input_109_2']");
	By LastName = By.xpath("//input[@id='input_109_3']");
	By Submit = By.xpath("//input[@id='gform_submit_button_109']");
	
		
	public InmarsatContactUs(WebDriver driver) {
		this.driver=driver;
		
	}
	
  public WebElement ProvideFName( ) {
	   
	  return driver.findElement(FirstName);
	  
  }

  public WebElement ProvideLName() {
	  
	  return driver.findElement(LastName);
  }
  
  public WebElement ClickSubmit() {
	  
	  return driver.findElement(Submit);
  }
}
