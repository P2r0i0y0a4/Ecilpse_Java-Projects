package methodOverloading;

public class Oneplus extends Phone {
	
	String brand="Oneplus";
	public static void main(String[] args) {
		Phone p=new Oneplus();
		Oneplus o=new Oneplus();
		System.out.println(p.brand);
		System.out.println(o.brand);
		
	}
}

