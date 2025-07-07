package java_practice;

public class Mobile {
	String brand;
	double price;
	int ram;
	Battery battery;
	Mobile(String brand, double price,int ram,Battery battery){
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.battery=battery;
	}
	public void mobileDetails() {
		System.out.println(brand+" "+price+" "+ram);
		battery.details();
	}
}
