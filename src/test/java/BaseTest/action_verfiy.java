package BaseTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ExtentListeners;

public class action_verfiy extends Baseclass {
	
	//private Logger log = Logger.getLogger(this.getClass());
	
	
	
	@Test
	public void verfiy_forinvalid_long_file() throws InterruptedException {
		
	    homepage.click_on_uploadfile();
	   
	    //log.info("clicking on browse file Button");
	    ExtentListeners.test.info("clicking on choose file " );
	    homepage.get_valid_DMS_file();
	    ExtentListeners.test.info("Uploading valid DMS format File");
	    Thread.sleep(4000);
	   // homepage.click_on_browse_file_longmissing();
	    Thread.sleep(4000);
	    ExtentListeners.test.info("Validatating File and Clicking on Submit and Download BTN " );
	    Baseclass.validate_submit_downloadbutton();
	    /*WebElement st =driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	    if(st.isEnabled()) 
	    {
	    	st.click();
	    }
	    
	    else 
	    {
	    	
	    	Assert.fail();
	    }
	 */
	    
	    
	    
	   
	    
	    
	    //WebElement st =driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	    
	   
	    
			
	}
	
	}

