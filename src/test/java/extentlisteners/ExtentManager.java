package extentlisteners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseTest.Baseclass;


//import base.BaseTest;


public class ExtentManager {

	private static ExtentReports extent;
	public static String fileName;
	
	

	        public static ExtentReports createInstance(String fileName) {
	        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
	       
	        
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle("KML Test Result");
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName("Automation Test Result");
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Automation Tester", "PRANIT SALPHALE");
	        extent.setSystemInfo("Automation Tester", "KHANDU KORE");
	        extent.setSystemInfo("Organization", "SIRPI");
	       // extent.setSystemInfo("Build no", "SIRPI-0000");
	        
	        
	        return extent;
	    }

	
	  
		public static void captureScreenshot() throws IOException {
			
			Date d = new Date();
		    fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

			
			
		File screeshot = ((TakesScreenshot)  Baseclass.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screeshot, new File(".//reports//"+fileName));
		}
		
		/*

		public static void captureElementScreenshot(WebElement element) throws IOException {
			
			Date d = new Date();
			String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

			
			
			File screeshot = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screeshot, new File(".//screenshot//"+"Element_"+fileName));
		}

	 */


	}
