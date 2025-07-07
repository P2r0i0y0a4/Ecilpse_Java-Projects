package java_practice;

public class ProjectDriver {
	public static void main(String[] args) {
		Project project=new Project("AI Chatgpt","PRJ001");
		ProjectManager manager=new ProjectManager("Priya",101,project);
		manager.displayManager();
	}

}
