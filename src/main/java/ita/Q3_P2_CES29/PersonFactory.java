package ita.Q3_P2_CES29;

public class PersonFactory {
	
	public static Model buildPerson(PersonType model) {
		Model person = null;
		switch(model) {
		case STUDENT:
			person = new Student();
			break;
		case TEACHER:
			person = new Teacher();
			break;
		default:
			//throw exception
			break;
		}
		
		return person;

	}
}
