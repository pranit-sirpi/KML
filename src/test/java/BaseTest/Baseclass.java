package BaseTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pom.HomePage;
import com.pom.Utility;

import extentlisteners.ExtentListeners;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
	public static WebDriver driver;
	private Logger log = Logger.getLogger(this.getClass());
	
	HomePage homepage;
	@Parameters("browsername")
	
	
	
	@BeforeMethod
	public void BrowserLaunch(String name) throws IOException {
		log.info("TEst Execution Started ");
		// ExtentListeners.test.info("Test Execution Started " );
		if(name.equals("chrome"))
		{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		}
		else if(name.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	driver.get(Utility.getproperty("URL"));
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    homepage = new HomePage(driver);
	}
	
	
	@AfterMethod
	public void Teardown() 
	{
		driver.close();
		// ExtentListeners.test.info("Test Execution Completed " );
	}
	
	
	public static void validate_submit_downloadbutton()
	{
		
		//WebDriverWait wait = new WebDriverWait();
		
		WebElement st =driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	    if(st.isEnabled()) 
	    {
	    	st.click();
	    }
	    
	    else 
	    {
	    	
	    	Assert.fail();
	    }
	}
}
