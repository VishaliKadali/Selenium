package week6.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReportsWithScreenshot {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest test=extent.createTest("Create Lead", "Create lead with mandatory fields");
		test.assignAuthor("Vishali");
		test.assignCategory("Smoke");
		test.pass("Username is entered successfully");
		//Step level information
		//Get screenshot when its passed
		MediaEntityModelProvider sreenshot = MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/snapshot.png").build();
		test.pass("Username is entered successfully",sreenshot);
		//Flush Report
		extent.flush();
	}
	}


