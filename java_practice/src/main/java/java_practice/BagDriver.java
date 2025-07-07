package java_practice;

public class BagDriver {
	public static void main(String[] args) {
		Bag b1=new Bag();
		b1.setColor("Green");
		b1.setPrice(2500);
		System.out.println(b1.getColor()+" "+b1.getPrice());
		Bag b2=new Bag();
		b2.setColor("White");
		b2.setPrice(5000);
		System.out.println(b2.getColor()+" "+b2.getPrice());

	}
}
