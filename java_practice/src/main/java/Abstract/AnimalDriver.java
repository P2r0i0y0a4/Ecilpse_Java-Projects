package Abstract;

public class AnimalDriver {
	public static void main(String[] args) {
		System.out.println("Dog");
		Animal a1=new dog();
		a1.sound();
		System.out.println("Cat");
		Animal a2=new Cat();
		a2.sound();
	}

}
