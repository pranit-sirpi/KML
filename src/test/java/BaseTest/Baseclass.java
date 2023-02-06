package BaseTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pom.HomePage;
import com.pom.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	HomePage homepage;
	@Parameters("browsername")
	@BeforeMethod
	public void BrowserLaunch(String name) throws IOException {
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
	}
}
