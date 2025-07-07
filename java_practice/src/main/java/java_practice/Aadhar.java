package java_practice;

public class Aadhar {
	long adharNum;
	String address;
	public Aadhar(long adharNum, String address){
		this.adharNum=adharNum;
		this.address=address;
	}
	public void displayAdhar() {
		System.out.println("Aadhar No:"+adharNum+" "+"Address:"+address);
	}

}
