package java_practice;

public class ExtDriver {
	public static void main(String[] args) {
		Phoni p= new Phoni();
		p.setModel("Oppo");
		p.setColour("white");
		p.setPrice(20000);
		p.getS().setBalance(100);
		p.getS().setPhoneno(9876543210l);
		p.addExternal_Memory();
		if(p.getE()==null) {
			System.out.println("external Memory is not in the phone");
		}
		else {
			p.getE().setBrand("Sony");
			p.getE().setPrice(2000);
			p.getE().setCapacity(3000);	
			System.out.println(p.getE().getBrand()+" "+p.getE().getCapacity()+" "+p.getE().getPrice());
		}
		System.out.println(p.getModel()+" "+p.getColour()+" "+p.getPrice());
		System.out.println(p.getS().getBalance()+" "+p.getS().getPhoneno());
	}
}
