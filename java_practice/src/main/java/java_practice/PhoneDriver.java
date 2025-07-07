package java_practice;

public class PhoneDriver {
	public static void main(String[] args) {
		Phone p=new Phone();
		/* p.model="Samsung";
		p.colour="Gold";
		p.price=1000000;
		p.getS().balance=100;
		p.getS().number=9876543210l;
		System.out.println(p.model);
		System.out.println(p.colour);
		System.out.println(p.price);
		System.out.println(p.getS().balance);
		System.out.println(p.getS().number);
		*/
		p.setModel("Samsung");
		p.setColour("Gold");
		p.setPrice(1000000);
		p.s.setNumber(9876543210l);
		p.s.setBalance(100);
		System.out.println(p.getModel());
		System.out.println(p.getColour());                                                           
		System.out.println(p.getPrice());
		System.out.println(p.s.getBalance());
		System.out.println(p.s.getNumber());
		
	}
}
