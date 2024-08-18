package javachallenge;

public class Constructor {
	
			// TODO Auto-generated method stub
			//It is a special type of method used to initialize 
			//It is called when an instance of a class is created.
		
	String make;
    String model;
    int year;
    
    // Default Constructor
    public Constructor() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }
    
    // Paramterized Constructor
    public Constructor(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    Constructor defaultCar = new Constructor(); //Constructor
    Constructor myCar = new Constructor("Toyota", "Camry", 2022);//parameterized constructor
}
