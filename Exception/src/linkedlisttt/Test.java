package linkedlisttt;
import java.util.LinkedList;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList <Integer> l=new LinkedList<>();
		for(int i=0;i<5;i++) {
			l.add(sc.nextInt());
		}
		for(int i=0;i<l.size()-1;i++) {
			int min=i;
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i)<l.get(min)) {
					min=j;
				}
			}
			if (min != i) {
				int temp=l.get(i);
				l.set(i,l.get(min));
				l.set(min, temp);
			}
		}
		System.out.println(l);
	}

}
