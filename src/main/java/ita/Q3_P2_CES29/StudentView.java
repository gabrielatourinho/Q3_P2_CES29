package ita.Q3_P2_CES29;

public class StudentView extends View {
	public void printStudentDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
	
	public void printDetails(String name, String rollNo) {
		this.printStudentDetails(name, rollNo);
	}

}
