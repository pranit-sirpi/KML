package BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases_with_validFies extends Baseclass
{
	
	
@Test
public void verify_valid_Dms_file() throws InterruptedException 
  {
    homepage.click_on_uploadfile();
    homepage.get_valid_DMS_file();
    Thread.sleep(3000);
    Baseclass.validate_submit_downloadbutton();
    
	
  }
@Test
public void verify_valid_Dmsspace_file() throws InterruptedException 
  {
    homepage.click_on_uploadfile();
    homepage.get_Valid_DMS_space_file();
    Thread.sleep(3000);
    Baseclass.validate_submit_downloadbutton();
    //homepage.click_on_submit();
	
  }
@Test
public void verify_valid_DDMspace_file() throws InterruptedException 
  {
    homepage.click_on_uploadfile();
    homepage.get_Valid_DDM_file();
    Thread.sleep(3000);
    Baseclass.validate_submit_downloadbutton();
    //homepage.click_on_submit();
	
  }
@Test
public void verify_valid_DD_file() throws InterruptedException 
  {
    homepage.click_on_uploadfile();
    homepage.get_Valid_DD_with_lable();
    Thread.sleep(3000);
    Baseclass.validate_submit_downloadbutton();
    //homepage.click_on_submit();
	
  }
@Test
public void verify_valid_DMSsapce_with_twolable_file() throws InterruptedException 
  {
    homepage.click_on_uploadfile();
    homepage.get_Valid_DMS_space_withTwo_lable();
    Thread.sleep(3000);
    Baseclass.validate_submit_downloadbutton();
    //homepage.click_on_submit();
	
  }
	
	

}
