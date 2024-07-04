package week5.testngAttributes;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(priority=-2)
	public void createLead() {
		System.out.println("Create Lead");
	}
	@Test(priority=1)
	public void editLead() {
		
		System.out.println("edit Lead");
	}
	@Test(priority=3)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}

}
