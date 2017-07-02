package ita.Q3_P2_CES29;

public abstract class Model {
	private String rollNo;
	private String name;
	private PersonType model = null;

	public Model(PersonType model) {
		this.model = model;
	}
	
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
