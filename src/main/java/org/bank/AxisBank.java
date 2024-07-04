package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("THis is ovrrrided deposit");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank obj=new AxisBank();
		
		obj.deposit();
		obj.fixed();
	}

}
