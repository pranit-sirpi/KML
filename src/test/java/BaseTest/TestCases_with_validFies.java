package BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases_with_validFies extends Baseclass
{
	
	
@Test
public void verify_valid_Dms_file() 
  {
    homepage.click_on_uploadfile();
    homepage.get_valid_DMS_file();
    homepage.click_on_submit();
	
  }
@Test
public void verify_valid_Dmsspace_file() 
  {
    homepage.click_on_uploadfile();
    homepage.get_Valid_DMS_space_file();
    homepage.click_on_submit();
	
  }
@Test
public void verify_valid_DDMspace_file() 
  {
    homepage.click_on_uploadfile();
    homepage.get_Valid_DDM_file();
    homepage.click_on_submit();
	
  }
@Test
public void verify_valid_DD_file() 
  {
    homepage.click_on_uploadfile();
    homepage.get_Valid_DD_with_lable();
    homepage.click_on_submit();
	
  }
@Test
public void verify_valid_DMSsapce_with_twolable_file() 
  {
    homepage.click_on_uploadfile();
    homepage.get_Valid_DMS_space_withTwo_lable();
    homepage.click_on_submit();
	
  }
	
	

}
