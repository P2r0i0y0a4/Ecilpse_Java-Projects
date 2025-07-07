package methodOverloading;

public class Samsung extends Phone {
	String brand="Samsumg";
	public static void main(String[] args) {
		Phone p=new Samsung();
		Samsung s=new Samsung();
		System.out.println(p.brand);
		System.out.println(s.brand);
		
	}
	

}
