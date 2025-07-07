package priorityqueue;

import java.util.*;
import java.util.*;
public class MovieDriver {

	public static void main(String[] args) {
		PriorityQueue <Movie> p=new PriorityQueue<>();
		Movie m=new Movie("Anjaan","Surya",500);
		Movie m1=new Movie("Leo ","Vijay",300);
		Movie m2=new Movie("nayandi","Dhanush",400);
		Movie m3=new Movie("Remo","SK",700);
		Movie m4=new Movie("Paiya","Karthi",800);
		p.offer(m);
		p.offer(m1);
		p.offer(m2);
		p.offer(m3);
		p.offer(m4);
		System.out.println("Lowest ticket price:"+p.poll());
		Scanner sc=new Scanner(System.in);
		int userPrice=sc.nextInt();
		System.out.println(p.contains(new Movie("","",userPrice)));
		System.out.println(p);
	}

}
