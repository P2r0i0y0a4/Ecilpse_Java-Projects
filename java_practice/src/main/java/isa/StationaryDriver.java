package isa;

public class StationaryDriver {
	public static void main(String[] args) {
		Pencil p=new Pencil();
		Pen p1=new Pen();
		p.setPrice(50);
		p.setQuantity(5);
		p.setBrand("Apsara");
		p.setThickness(10);
		p1.setColour("Black");
		p1.setRefillable(true);
		System.out.println("Pencil: "+p.getPrice()+" "+p.getQuantity());
		System.out.println("Stationary: "+p.getBrand()+" "+p.getThickness());
		System.out.println("Pen: "+p1.getColour()+" "+p1.isRefillable());
	}
}
