package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		
		System.out.println("Student name is Vishali");
	}
	
	public void studentDept() {
		
		System.out.println(" Computer Science Department ");
	}
	
	public void studentId() {
		
		System.out.println("Student Identification number is A0599");
	}
	
public static void main(String args[])	{
	
	Student obj=new Student();
	obj.studentName();
	obj.studentDept();
	obj.studentId();
	obj.deptName();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
}
	

}
