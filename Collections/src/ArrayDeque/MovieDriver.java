package ArrayDeque;

import java.util.ArrayDeque;

import priorityqueue.Movie;

public class MovieDriver {
	public static void main(String[] args) {
		ArrayDeque <Movie> a=new ArrayDeque<>();
		a.offer(new Movie("Anjaan","Surya",500));
		a.offer(new Movie("nayandi","Dhanush",300));
		a.offer(new Movie("Leo","Vijay",150));
		a.offer(new Movie("GL","Hiamanshu",400));
		a.offer(new Movie("Chittapa","Sharon",300));
	}

}
