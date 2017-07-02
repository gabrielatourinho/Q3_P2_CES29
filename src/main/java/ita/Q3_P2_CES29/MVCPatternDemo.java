package ita.Q3_P2_CES29;

public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		
		Model s1 = PersonFactory.buildPerson(PersonType.STUDENT);
		Model t1 = PersonFactoryReflection.buildPerson(PersonType.TEACHER);
		Model s2 = PersonFactoryReflection.buildPerson(PersonType.STUDENT);
		
		s1 = retriveFromDatabase(s1);
		t1 = retriveFromDatabase(t1);
		s2 = retriveFromDatabase(s2);
		
		// Create a view : to write student details on console

		Controller controller = new Controller(s1);

		controller.updateView();

		// update model data
		controller.setName("John");

		controller.updateView();
		
		//change person
		controller.changePerson(t1);
		
		controller.updateView();
		
		controller.setName("Dumbledore");
		controller.setRollNo("1");
		
		controller.updateView();
		
		//change person
		controller.changePerson(s2);
		
		controller.updateView();
	}

	private static Model retriveFromDatabase(Model model) {
		if(model instanceof Student) {
			return retriveStudentFromDatabase();
		}
		else if(model instanceof Teacher) {
			return retriveTeacherFromDatabase();
		}
		else
			return null;
	}
	
	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
	private static Teacher retriveTeacherFromDatabase() {
		Teacher teacher = new Teacher();
		teacher.setName("Minerva");
		teacher.setRollNo("2");
		return teacher;
	}

}
