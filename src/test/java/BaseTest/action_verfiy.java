package BaseTest;

import org.testng.annotations.Test;

public class action_verfiy extends Baseclass {
	
	
	@Test
	public void verify_latlong_sampledata() throws InterruptedException 
	{
		homepage.lat_long_samp(driver);
	
		Thread.sleep(5000);
	}

	
	@Test
	public void verify_UTM_sampledata() throws InterruptedException 
	{
		homepage.UTM_samp(driver);
	
		Thread.sleep(5000);
	}
	
}
