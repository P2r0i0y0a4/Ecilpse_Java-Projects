package one;

import java.util.ArrayList;

public class Pani_Driver {
	public static void main(String[] args) {
		ArrayList<Panimalar> p=new ArrayList<>();
		p.add(new Panimalar("CSE",125000,524));
		p.add(new Panimalar("ECE",115000,414));
		p.add(new Panimalar("EEE",100000,150));
		p.add(new Panimalar("AIDS",90000,234));
		p.add(new Panimalar("IT",100000,320));
		p.add(new Panimalar("AIML",190000,67));
		p.add(new Panimalar("Mech",90000,116));
		p.add(new Panimalar("CSBS",115000,247));
		System.out.println(p.stream().distinct().toList());
		//System.out.println(p);
		System.out.println(p.stream().max((a,b)->a.student_count-b.student_count));
	}

}
