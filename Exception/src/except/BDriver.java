package except;

import java.util.Arrays;

public class BDriver {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setPrice(100);
		b1.setAuthor("ABC");
		Book b2=new Book();
		b2.setPrice(10);
		b2.setAuthor("XYZ");
		Book b3=new Book();
		b3.setPrice(500);
		b3.setAuthor("PQR");
		Book[] b= {b1,b2,b3};
		Arrays.sort(b);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
				 
		}
	}

}
