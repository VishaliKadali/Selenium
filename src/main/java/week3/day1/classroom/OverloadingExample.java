package week3.day1.classroom;

public class OverloadingExample {
	
	//Why overloading? To improve verbose

	public int sum(int a, int b) {
		
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public String getVehicleName(String whom) {
		return "Babu";
	}
	
	public String getVehicleName(int what) {
		return "Babu";
	}
	
	public String getVehicleName(int data, String whom) {
		return "Babu";
	}
}
