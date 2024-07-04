package week6.day1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryFailedTests implements IRetryAnalyzer, IAnnotationTransformer {
	int count=0;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<2) {
			count++;
			return true;
		}
		
		return false;
	}
	
	
	//Overriden the transform method using annotation(ITestAnnotation), sets the retryAmalyzer during the runtime
	public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// not implemented
		annotation.setRetryAnalyzer(RetryFailedTests.class);
	  }
}
