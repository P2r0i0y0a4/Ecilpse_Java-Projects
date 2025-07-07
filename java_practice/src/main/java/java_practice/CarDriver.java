package java_practice;

public class CarDriver {
	public static void main(String[] args) {
		Car c=new Car();
		c.model="Jaguar";
		c.colour="Black";
		c.price=200000000;
		//c.addRadio();
		c.addRadio();
		if(c.r==null) {
			System.out.println("Not Present");
		}
		else {
			c.r.model="philips";
			c.r.price=900;
			System.out.println(c.r.model);
			System.out.println(c.r.price);
		}
		/*c.r.model="philips";
		c.r.price=900;
		*/
		
		System.out.println(c.model);
		System.out.println(c.colour);
		System.out.println(c.price);
		//System.out.println(c.r.model);
		//System.out.println(c.r.price);
	
		
	}

}
