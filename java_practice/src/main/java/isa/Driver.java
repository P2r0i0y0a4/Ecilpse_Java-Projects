package isa;

public class Driver {
	public static void main(String[] args) {
		Phone p=new Phone();
		p.setModel("Android");
		p.setBrand("Samsung");
		p.setPrice(1000000);
		System.out.println(p.getBrand()+" "+p.getPrice());
		System.out.println(p.getModel());
	}
}
