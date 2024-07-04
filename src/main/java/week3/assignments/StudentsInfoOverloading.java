package week3.assignments;

public class StudentsInfoOverloading {

	public void getStudentInfo(int id) {

		System.out.println("Student ID is " + id);
	}

	public void getStudentInfo(int id,String name) {

		System.out.println("Student ID "+ id +" Name " + name);
	}

	
	public void getStudentInfo(long number, String email) {
		
		System.out.println("Phone number: " +number+ "Email: "+email);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentsInfoOverloading obj = new StudentsInfoOverloading();
		obj.getStudentInfo(4741);
		obj.getStudentInfo(4741,"Vishali");
		obj.getStudentInfo(999439820, "vishali@gmail.com");
	}

}
