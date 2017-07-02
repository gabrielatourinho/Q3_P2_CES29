package ita.Q3_P2_CES29;

public class PersonFactoryReflection {
	public static Model buildPerson(PersonType model) {
		Model person = null;
		try {
			
			String firstLetter = model.toString().substring(0, 1);
			String rest = model.toString().substring(1).toLowerCase();
			Class<?> realFact = Class.forName("ita.Q3_P2_CES29."+firstLetter+rest);
			person = (Model) realFact.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}

}