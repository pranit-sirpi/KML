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
	
	//--------
	@Test
	public void verify_DDlat_OOB() 
	{
		homepage.click_on_uploadfile();
		homepage.browse_DD_latOOB();
		Object st5=homepage.gettextfromWebelement();
		System.out.println(st5);
		Assert.assertEquals(st5, "Error in Coordinate System Values:\n"
				+ "Please ensure that in DD format, Latitude should have a degree (°) as degrees, (N or S) as compass direction and should lie in between 0 and 90.0");
	}
	
	@Test
	public void verfiy_DDlong_OOB() 
	{
		homepage.click_on_uploadfile();
		homepage.browse_DD_longOOB();
		Object st6 = homepage.gettextfromWebelement();
		System.out.println(st6);
		Assert.assertEquals(st6,"Error in Coordinate System Values:\n"
				+ "Please ensure that in DD format, Longitude should have a degree (°) as degrees, (E or W) as compass direction and should lie in between 0 and 180.0");
		
	}
	@Test
	public void verfiy_DDMlat_OOB() 
	{
		homepage.click_on_uploadfile();
		homepage.browse_DDM_latOOB();
		Object st7=homepage.gettextfromWebelement();
		System.out.println(st7);
		Assert.assertEquals(st7,"Error in Coordinate System Values:\n"
				+ "Please ensure that in DDM format, Latitude should have a degree (°) as degrees, a single quote (') as minutes, (N or S) as compass direction and should lie in between 0 and 90.0");
		
	}
	@Test
    public void verify_DDMlong_OOB() 
    {
   	 
   	 homepage.click_on_uploadfile();
   	 homepage.browse_DDM_longOOB();
   	 Object st8=homepage.gettextfromWebelement();
   	 System.out.println(st8);
   	Assert.assertEquals(st8,"Error in Coordinate System Values:\n"
   			+ "Please ensure that in DDM format, Longitude should have a degree (°) as degrees, a single quote (') as minutes, (E or W) as compass direction and should lie in between 0 and 180.0");
    }
	
	@Test
    public void verify_DMSlat_OOB() 
    {
   	 homepage.click_on_uploadfile();
   	 homepage.browse_DMS_latOOB();
   	 Object st9 =homepage.gettextfromWebelement();
   	 System.out.println(st9);
   	Assert.assertEquals(st9,"Error in Coordinate System Values:\n"
   			+ "Please ensure that in DMS format, Latitude should have a degree (°) as degrees, a single quote (') as minutes, a double quote (\") as seconds, (N or S) as compass direction and should lie in between 0 and 90.0");
    }
	
	@Test
    public void verify_DMSlong_OOB() 
    {
   	 
   	 homepage.click_on_uploadfile();
   	 homepage.browse_DMS_longOOB();
   	 Object st10=homepage.gettextfromWebelement();
   	 System.out.println(st10);
   	 Assert.assertEquals(st10,"Out of bound values entered in the Coordinate system values.\n"
   	 		+ "Please ensure that in DMS format, Longitude lies in between 0 and 180.0");
    }
	
	

}
