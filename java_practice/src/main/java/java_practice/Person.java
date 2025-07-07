package java_practice;

public class Person {
	String firstName;
	String lastName;
	String dob;
	Aadhar aadhar;
	
	public Person(String firstName,String lastName,String dob, Aadhar aadhar){
		this.firstName=firstName;
		this.lastName=lastName;
		this.dob=dob;
		this.aadhar=aadhar;
	}
	public void display() {
		System.out.println("FirstName:"+firstName+" "+"LastName:"+lastName+" "+"DOB"+" "+dob+" "+"Aadhar"+" "+aadhar);
		aadhar.displayAdhar();
	}

}
