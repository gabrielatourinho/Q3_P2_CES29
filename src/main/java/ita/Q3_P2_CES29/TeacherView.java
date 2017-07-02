package ita.Q3_P2_CES29;

public class TeacherView extends View {
	public void printTeacherDetails(String teacherName, String teacherRollNo) {
		System.out.println("Teacher: ");
		System.out.println("Name: " + teacherName);
		System.out.println("Roll No: " + teacherRollNo);
	}
	
	public void printDetails(String name, String rollNo) {
		this.printTeacherDetails(name, rollNo);
	}
}
