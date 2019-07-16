package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

public class base {
	
	public WebDriver driver; 
	public Properties prop;	
	public static Logger log1;
	
	@BeforeSuite
	public void bsuite() throws FileNotFoundException, IOException {
		
		String log4jConfigFile = "C:\\Users\\Holly Le Tual\\QTProject\\src\\main\\java\\resources\\log4j2.xml";
		ConfigurationSource source = new ConfigurationSource(new FileInputStream(log4jConfigFile));
		Configurator.initialize(null, source);
		log1 = Logger.getLogger(base.class.getName());
		
		
		
		
	}
	
	public WebDriver initializeDriver() throws IOException {
		
		
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Holly Le Tual\\QTProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		
		else if(browsername.equals("firefox")) {
			
			driver = new FirefoxDriver();
		}
		
		else {
			driver = new InternetExplorerDriver();
			}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
