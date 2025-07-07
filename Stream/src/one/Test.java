package one;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(24);
		list.add(31);
		list.add(3);
		list.add(7);
		list.add(40);
		list.add(36);
		list.removeIf(a -> a%2==0);
		System.out.println(list);
		System.out.println(list.stream());
	}

}
