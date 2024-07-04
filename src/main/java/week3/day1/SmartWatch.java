package week3.day1;

public abstract class SmartWatch implements Watch{
	
	public void checkHeart() {
		System.out.println("Heart Beat");
	}

	
	public void setAlarm() {
		
		System.out.println("Set Alarm ON/OFF");
		
	}
	
	public abstract void mountingSteps();
}
