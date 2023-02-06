package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	@FindBy(xpath="//input[@value='manual']") private WebElement paste_data_manually; 
	@FindBy(xpath="//input[@value='upload']")   private WebElement upload;
	@FindBy(xpath="(//button[@type='button'])[1]") private WebElement Reset;
	@FindBy(xpath="//input[@type='file']") private WebElement BrowseFile;
	@FindBy(xpath="//span[text()='Submit and Download']") private WebElement submit_and_download;
	@FindBy(xpath="//input[@name='KML']")private  WebElement KML;
	@FindBy(xpath="//input[@name='CSV']")private WebElement CSV;
	@FindBy(xpath="//textarea[@id='textarea__input']")private  WebElement enter_data;
	@FindBy(xpath="//div[@role='alert']") private WebElement alert;
	@FindBy(xpath="//div[@role='alert']") private WebElement latalert;
	@FindBy(xpath="//a[text()='Lat/Long Sample']") private WebElement sample_latLong;
	@FindBy(xpath="//a[text()='UTM Sample']") private WebElement sample_UTM;
	
	
	public HomePage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void click_on_uploadfile() 
	{
		upload.click();
	}
	public boolean uploadfile() 
	{ 
		
	boolean b =upload.isEnabled();
	return b;
	
	}
	public void lat_long_samp(WebDriver driver) 
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(sample_latLong).build().perform();
		sample_latLong.click();
		
	}
	public void UTM_samp(WebDriver driver) 
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(sample_UTM).build().perform();
		sample_UTM.click();
		
	}
	
	public void click_on_browse_file_utm_fivelable() 
	{
		    String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Files\\Earthquakes UTM.xlsx");
	}
	public void click_on_submit() 
	{
		submit_and_download.click();
	}
	public void click_on_manualy() 
	{
		paste_data_manually.click();
	}
	
      public void get_data_from_file(String Enterdata) 
      {
    	  enter_data.sendKeys(Enterdata);
      }
      public void click_on_browse_file_lat_long_fivelable() 
  	{
  		    String projectpath = System.getProperty("user.dir");
  		    
  			BrowseFile.sendKeys(projectpath+"\\Files\\UFO sightings.xlsx");
  	}
      public void click_on_browse_file_lat_lon_1with400data() 
    	{
    		    String projectpath = System.getProperty("user.dir");
    		    System.out.println(projectpath);
    			BrowseFile.sendKeys(projectpath+"\\Files\\cal_cities_lat_long.xlsx");
    	}
      public void click_on_browse_file_longmissing() 
  	{
  		    String projectpath = System.getProperty("user.dir");
  		    System.out.println(projectpath);
  			BrowseFile.sendKeys(projectpath+"\\Files\\Longitude missing.xlsx");
  	}
      public void click_on_browse_file_latmissing() 
  	{
  		    String projectpath = System.getProperty("user.dir");
  		    System.out.println(projectpath);
  			BrowseFile.sendKeys(projectpath+"\\Files\\Lattitude missing.xlsx");
  	}
      public String gettextfromWebelement() 
      {
         String str =alert.getText();
		 return str;
    	  
      }
      public void click_on_browse_file_latOutofBound() 
    	{
    		    String projectpath = System.getProperty("user.dir");
    		    
    			BrowseFile.sendKeys(projectpath+"\\Files\\LatitudeOutOfBound.xlsx");
    	}
      public void click_on_browse_file_longOutofBound() 
    	{
    		    String projectpath = System.getProperty("user.dir");
    		    
    			BrowseFile.sendKeys(projectpath+"\\Files\\LongitudeOutOfBound.xlsx");
    	}
      public void click_on_browse_file_UTMOutofBound() 
  	{
  		    String projectpath = System.getProperty("user.dir");
  		   
  			BrowseFile.sendKeys(projectpath+"\\Files\\UTM Easting OutOfBound.xlsx");
  	}
      public void get_valid_DMS_file() 
      {
    	  
    	  String projectpath =System.getProperty("user.dir");
    	  BrowseFile.sendKeys(projectpath+"\\ValidFiles\\Valid DMS format.xlsx");
    	  
      }
      public void get_Valid_DDM_file() 
      {
    	  String projectpath =System.getProperty("user.dir");
    	  BrowseFile.sendKeys(projectpath+"\\ValidFiles\\Valid DDM(space) format.xlsx");
      }
      public void get_Valid_DD_with_lable() 
      {
    	  String projectpath =System.getProperty("user.dir");
    	  BrowseFile.sendKeys(projectpath+"\\ValidFiles\\Valid DD format with lable.xlsx");
      }
      public void get_Valid_DMS_space_file() 
      {
    	  String projectpath =System.getProperty("user.dir");
    	  BrowseFile.sendKeys(projectpath+"\\ValidFiles\\Valid DMS(space) format.xlsx");
      }
      public void get_Valid_DMS_space_withTwo_lable() 
      {
    	  String projectpath =System.getProperty("user.dir");
    	  BrowseFile.sendKeys(projectpath+"\\ValidFiles\\Valid DMS(space) format with 2 lables and 5 row data.xlsx");
      }
      //<<<<<<............lat Long Headers methods are started.........>>>>>>
      
      public void get_lat_deg_long_degg()
      {
    	  String projectpath = System.getProperty("user.dir");
		    System.out.println(projectpath);
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\lat_deg long_degg.xlsx");
      }
      public void get_lat_deg_longi_deg()
      {
    	  String projectpath = System.getProperty("user.dir");
		
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\lat_deg longi_deg.xlsx");
      }
      public void get_lat_deg_longideg1()
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\lat_deg longi_deg.xlsx");
      }
      public void get_Lat_X_Long_X() 
      {
    	
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Lat_X Long_X.xlsx");
      }
      public void get_Lat_Y_Long_Y() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Lat_Y Long_Y.xlsx");
      }
      public void get_latdeg_longdeg() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\latdeg longdeg.xlsx");
      }
      public void get_lat_deg_long_deg()
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Lat_Y Long_Y.xlsx");
      }
      public void get_lat_deg_longideg2() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\latdeg longdeg.xlsx");
      }
      
      public void get_lati_deg_long_deg1() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\lat-deg long-deg.xlsx");
      }
      public void get_lati_deg_long_deg2() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\lat deg longi deg.xlsx");
      }
      public void get_Lati_Longi() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Lati Longi.xlsx");
      }
      public void Latitudde_Longitudde() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Latitudde Longitudde.xlsx"); 
      }
      
      public void latitUde_X_longitUde_z() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\latitUde_X longitUde_z.xlsx");
      }
      public void latitude_degrees_longitude_degrees() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\latitude-degrees longitude-degrees.xlsx");
      }
      public void lAtitude_iOngitude() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\lAtitude lOngitude.xlsx");
      }
      public void Latitudes_Longitudes() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Latitudes Longitudes.xlsx");
      }
      public void Latitude_X_loni_deg() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Latitude X longi_deg.xlsx");
      }
      public void Lat_Lon() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Lat Lon.xlsx");
      }
      public void Lat_Long() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Lat Long.xlsx");
      }
      public void latt_x_long_y()
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\latt,x long, y.xlsx");
      }
      public void latt_y_long_x()
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\latt,y long, x.xlsx"); 
      }
      public void lattitude_longgitude1() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\lattitude longgitude.xlsx");  
      }
      public void lattitude_longgitude2() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\lattitude  longgitude.xlsx");
      }
      public void Lat_X_Long_x() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\Lat X Long x.xlsx");
      }
      public void latx_Long_y() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\latx Long y.xlsx");
      }
      public void LongitudeX_LatitudeY() 
      {

    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\LongitudeX LatitudeY.xlsx");
      }
      public void xlat_Long_X() 
      {
    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\xlat Long X.xlsx");
      }
      public void x_y() 
      {

    	  String projectpath = System.getProperty("user.dir");
		   
			BrowseFile.sendKeys(projectpath+"\\Lat-long-Headers\\x y.xlsx");
      }
}
