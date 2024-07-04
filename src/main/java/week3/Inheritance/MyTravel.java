package week3.Inheritance;

public class MyTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle obj=new Vehicle();
		
		obj.nonPersonalUse(null);
		obj.personalUse(null);
		
		//Bus obj1=new Bus();
		//obj1.sleeperAC();
				
		AshokLeyland obj2=new AshokLeyland();
		obj2.houseShifting();
		obj2.takeLoad();
		
		Tata obj3=new Tata();
		obj3.chairCar();
	}

}
