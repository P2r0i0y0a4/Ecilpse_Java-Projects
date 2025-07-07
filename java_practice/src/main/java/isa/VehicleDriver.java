package isa;

public class VehicleDriver {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.setBrand("Royal Enfield");
		b.setName("ThunderBird");
		b.setCc(350);
		Car c=new Car();
		c.setName("nano");
		c.setColour("Blue");
		c.setNo_of_seats(4);
		System.out.println("Bike:");
		System.out.println("name:"+b.getName()+" "+"Brand:"+b.getBrand()+" "+"cc:"+b.getCc());
		System.out.println("Car:");
		System.out.println("name:"+b.getName()+" "+"Brand:"+b.getBrand()+" "+"cc:"+c.getNo_of_seats());
	}

}
