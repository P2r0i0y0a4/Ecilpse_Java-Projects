package java_practice;

public class Car_Driver {
	public static void main(String[] args) {
		Ccar c=new Ccar();
		c.model="Ferroro";
		c.colour="white";
		c.price=20000000;
		c.e.horsePower=123;
		c.e.fuelType="CNG";
		c.addRadio();
		if(c.r==null) {
			System.out.println("Radio is not present");
		}
		else {
			c.r.brand="philips";
			c.r.price=10000000;
			System.out.println(c.r.brand);
			System.out.println(c.r.price);
		}
		System.out.println(c.model+" "+c.colour+" "+c.price);
		System.out.println(c.e.horsePower+" "+c.e.fuelType);
	}

}
