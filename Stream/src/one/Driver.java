package one;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Book> b=new ArrayList<>();
		b.add(new Book("Surya","Vikings",200));
		b.add(new Book("Janani","Japanese",100));
		b.add(new Book("Janani","Japan",1000));
		b.add(new Book("Shakespeare","Merchant of venice",450));
		
		System.out.println(b.stream().max((a,c)->a.price-c.price));
		System.out.println(b.stream().distinct().toList());
		System.out.println(b.stream().distinct());

	}

}
