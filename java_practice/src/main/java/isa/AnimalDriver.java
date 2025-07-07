package isa;

public class AnimalDriver {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.setName("Bruno");
		d.setNo_of_legs(4);
		Cat c=new Cat();
		c.setName("Tom");
		c.setFav_food("Fish");
		System.out.println("Cat:");
		System.out.println("name:"+c.getName()+" "+"Fav_food:"+c.getFav_food());
		System.out.println("Dog:");
		System.out.println("name:"+d.getName()+" "+"no_of_legs:"+d.getNo_of_legs());
	}
}