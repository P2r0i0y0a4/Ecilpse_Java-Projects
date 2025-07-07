package arrayLists;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Book> b=new ArrayList<>();
		b.add(new Book("Vikings","Surya"));
		b.add(new Book("Japanese","janani"));
		b.add(new Book("Titanic","Nasiya"));
		b.add(new Book("Java","Dixit Sir"));
		Book k=new Book("Harry Potter","Ms Rahul");
		//b.add(new Book("Harry Potter","Ms Rahul"));
		//System.out.println(b.contains(k));
		b.add(k);
		System.out.println(b.remove(k));
		System.out.println(b);
	}

}
