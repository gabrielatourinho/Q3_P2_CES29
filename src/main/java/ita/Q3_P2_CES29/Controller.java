package ita.Q3_P2_CES29;

public class Controller {
	private Model model;
	private View view = null;

	public Controller(Model person) {
		this.model = person;
		this.createView(person);
	}

	public void createView(Model person) {
		if(model instanceof Student) {
			this.view = new StudentView();
		}
		else if(model instanceof Teacher) {
			this.view = new TeacherView();
		}
	}
	
	public void setName(String name) {
		model.setName(name);
	}

	public String getName() {
		return model.getName();
	}

	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printDetails(model.getName(), model.getRollNo());
	}
	
	public void changePerson(Model person) {
		this.model = person;
		this.createView(person);
	}
}
