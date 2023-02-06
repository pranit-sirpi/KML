package BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases_withinvalidFile_ErrorMsg extends Baseclass {
	
	
	@Test
	public void verfiy_forinvalid_long_file() 
	{
	   homepage.click_on_uploadfile();
	   homepage.click_on_browse_file_longmissing();
	   Object st = homepage.gettextfromWebelement();
       Assert.assertEquals(st, "Error in Coordinate System Headers: Check whether Longitude is present.");
		
			
	}
	
	@Test
	public void verify_forinvalid_lat_file() 
	{
	
		homepage.click_on_uploadfile();
		homepage.click_on_browse_file_latmissing();
		Object st1 =homepage.gettextfromWebelement();
		Assert.assertEquals(st1,"Error in Coordinate System Headers: Check whether Latitude is present.");
		
    }
	@Test
	public void verify_for_latoutofbound() 
	{
		homepage.click_on_uploadfile();
		homepage.click_on_browse_file_latOutofBound();
		Object st3=homepage.gettextfromWebelement();
		System.out.println(st3);
		
		Assert.assertEquals(st3,"Out of bound values entered in the Coordinate system values.\n"
				+ "Please ensure that Latitude lies in between -90.0 and 90.0");
		
	
	}
	public void verify_for_utmEastingoutofbound() 
	{
		homepage.click_on_uploadfile();
		homepage.click_on_browse_file_UTMOutofBound();
		Object st3=homepage.gettextfromWebelement();
		System.out.println(st3);
		
		Assert.assertEquals(st3,"Out of bound values entered in the Coordinate system values.\n"
				+ "Please ensure that Easting lies in between 160,000.0 and 834,000.0");
		
	
	}

	@Test
	public void verify_for_laonoutofbound() 
	{
		homepage.click_on_uploadfile();
		homepage.click_on_browse_file_longOutofBound();
		Object st4=homepage.gettextfromWebelement();
	System.out.println(st4);
		
	Assert.assertEquals(st4,"Out of bound values entered in the Coordinate system values.\n"
			+ "Please ensure that Longitude lies in between -180.0 and 180.0");
	}

}
