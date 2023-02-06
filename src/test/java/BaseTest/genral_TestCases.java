package BaseTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.Utility;

public class genral_TestCases extends Baseclass {
	
	@Test
	public void verifyTitle() 
	{
		String str =driver.getTitle();
		Assert.assertEquals(str, "Wind Pioneers Coordinate Plotter");
	}
	
	@Test()
	public void verify_upload_file() throws InterruptedException 
	
	{
		//homepage.click_on_manualy();
	    homepage.click_on_uploadfile();
		Thread.sleep(4000);
		homepage.click_on_browse_file_utm_fivelable();
		Thread.sleep(4000);
		homepage.click_on_submit();
		Thread.sleep(3000);
		
	}

	@Test
	public void veify_uploadfile_Button() 
	{
		
		homepage.uploadfile();
	}
	
}
