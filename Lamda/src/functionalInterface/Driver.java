package functionalInterface;

public class Driver {
	public static void main(String[] args) {
		Laptop l=(p,b,r)->{
			System.out.println("Price="+p+" , Brand="+b+" , Ram_Size="+r);
		};
		l.display(10000,"Samsung",16);
		
	}

}
