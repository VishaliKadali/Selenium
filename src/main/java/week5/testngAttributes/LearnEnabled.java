package week5.testngAttributes;

import org.testng.annotations.Test;

public class LearnEnabled {
	
	
	/*
	 * Enabled-Is used to disable the testcase from execution 
	 * Default value is boolean
	 * Shown as ignored method in test-output
	 */
	@Test(enabled=true)
	public void createLead() {
		
		
	}
	@Test(enabled=true)
	public void editLead() {
		
		
	}
	@Test(enabled=false)
	public void deleteLead() {
		
	}
}
