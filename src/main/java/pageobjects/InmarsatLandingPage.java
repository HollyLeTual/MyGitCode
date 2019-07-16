package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InmarsatLandingPage {
	
	
	public WebDriver driver;
	
	By Contact = By.xpath("//li[@id='menu-item-1690']//a[contains(text(),'Contact us')]");
	By Welcometext = By.xpath("//h1[contains(text(),'Partner Search')]");
	
	
	public InmarsatLandingPage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	public WebElement ClickContact() {
		
		return driver.findElement(Contact);
		
	}

	public WebElement VerifyHomePageText() {
		
		return driver.findElement(Welcometext);
				
	}
	
	
}
