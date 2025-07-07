package java_practice;

public class AdharDriver {
	public static void main(String[] args) {
		Aadhar aadhar=new Aadhar(210596450475l,"Chennnai");
		Person person=new Person("Priya","dharshini","29-07-2004",aadhar);
		person.display();
	}

}
