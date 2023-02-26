package BaseTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.Utility;

import extentlisteners.ExtentListeners;

public class genral_TestCases extends Baseclass {
	
	@Test
	public void verifyTitle() 
	

	{
		String str =driver.getTitle();
		 ExtentListeners.test.info("Getting page title " );
		 
		 ExtentListeners.test.info("Validating the Expected title with Actual" );
		 
		Assert.assertEquals(str, "Wind Pioneers Coordinate Plotter");
	}
	
	@Test()
	public void verify_upload_file() throws InterruptedException 
	
	{
	
		ExtentListeners.test.info("Clicking on upload a file");
	    homepage.click_on_uploadfile();
	    ExtentListeners.test.info("Clicking on browse file" );
		Thread.sleep(4000);
		ExtentListeners.test.info("uploading valid file with five lables");
		homepage.click_on_browse_file_utm_fivelable();
		Thread.sleep(4000);
		ExtentListeners.test.info("Clicking on Submit and Download");
		homepage.click_on_submit();
		Thread.sleep(3000);
		
	}

	@Test
	public void veify_uploadfile_Button() 
	{
		ExtentListeners.test.info("Clicking on upload file");
		
		homepage.uploadfile();
		ExtentListeners.test.info("uploading file");
		
	}
	
	@Test
	public void verify_paste_manual() 
	{
		homepage.paste_manual();
	}
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
	@Test
	public void verify_satalliteview() 
	{
		 homepage.stalliteview();
	}
	
	
	@Test
	public void verfiy_Mapview() throws InterruptedException 
	{
		
		homepage.stalliteview();
		Thread.sleep(4000);
		homepage.Mapview();
		
	}
	
	@Test
	public void verify_Kml_Checkbox() 
	{
		homepage.kmlcheckbox();
	}
	
	@Test
	public void verify_Csv_Checkbox() 
	{
		homepage.Csvcheckbox();
	}
	
	@Test
	public void verfiyZoom_in_ZoomOut() 
	{
	    homepage.click_on_uploadfile();
		homepage.get_genralfile();
		homepage.click_on_submit();
		homepage.stalliteview();
		homepage.clickonzoomin();
		homepage.clickonZoomout();
	}

}
