package java_practice;

public class ProjectManager {
	String name;
	int empID;
	Project project;
	ProjectManager(String name,int empID,Project project){
		this.name=name;
		this.empID=empID;
		this.project=project;
	}
	public void displayManager() {
		System.out.println(name+" "+empID);
		project.details();
	}

}
