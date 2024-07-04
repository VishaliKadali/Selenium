package week3.Inheritance;

public class Tata extends Vehicle{
	
	public void chairCar() {
		
		System.out.println("Sleeper and Non Sleeper personal use");
	}
	
	public void personalUse(String AutoDrive) {
		
		System.out.println("Drives Automatically");
		
		return;
	}

	public static void main(String args[]) {
	
	Tata obj=new Tata();
	obj.personalUse(null);
	
}

}
