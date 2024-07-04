package week3.day1.classroom;

public class LearnEncap {

	private String creditCardNum= "1121 8822 9299 9911";

	public String getCreditCardNum() {
		return creditCardNum;
	}
	
	//How to provide only read access and not write access?
	
	
	public void setCreditCardNum(String credit) {
		 this.creditCardNum=credit;
		//this refers to the local class variable
	}

}
