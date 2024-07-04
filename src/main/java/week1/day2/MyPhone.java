package week1.day2;

import week.day1.OnePlus;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OnePlus myPhone=new OnePlus();
		myPhone.batteryStatus();
		
		//You cannot get the modelName if it is declared in return type, write as below
		
		String modelName=myPhone.getModelName();
		System.out.println(modelName);
	}

}
