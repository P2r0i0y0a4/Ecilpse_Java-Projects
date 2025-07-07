package java_practice;

public class ECarDriver {
	public static void main(String[] args) {
		ECar c=new ECar();
		c.setModel("Ferroro");
		c.setColour("white");
		c.setPrice(20000000);
		c.getE().setHorsePower(123);
		c.getE().setFuelType("CNG");
		c.addRadio();
		if(c.getR()==null) {
			System.out.println("Radio is not present");
		}
		else {
			c.getR().setBrand("Philips");
			c.getR().setPrice(1000000);
			System.out.println(c.getR().getBrand());
			System.out.println(c.getR().getPrice());
		}
		System.out.println(c.getModel()+" "+c.getColour()+" "+c.getPrice());
		System.out.println(c.getE().getHorsePower()+" "+c.getE().getFuelType());
	}

}
