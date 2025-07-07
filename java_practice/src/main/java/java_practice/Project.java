package java_practice;

public class Project {
	String projectName;
	String projectId;
	Project(String projectName,String projectId){
		this.projectName=projectName;
		this.projectId=projectId;
	}
	public void details() {
		System.out.println("Project Name:"+projectName+" "+"Project ID:"+projectId);
	}

}
