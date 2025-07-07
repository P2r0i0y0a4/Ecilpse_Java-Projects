package isa;

public class FruitDriver {
	public static void main(String[] args) {
		Kiwi k=new Kiwi();
		k.setName("Kiwi");
		k.setColour("Green");
		k.setSeeds(true);
		System.out.println("Kiwi:");
		System.out.println("name:"+k.getName()+" "+"colour:"+k.getColour()+" "+"seeds:"+k.isSeeds());
	}

}
