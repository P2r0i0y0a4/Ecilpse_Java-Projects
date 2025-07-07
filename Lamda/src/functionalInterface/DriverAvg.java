package functionalInterface;

import java.util.Scanner;

public class DriverAvg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		int d1=sc.nextInt();
		int e1=sc.nextInt();
		Average z=(a,b,c,d,e)->a+b+c+d+e/5;
			
		System.out.println(z.calculate(a1, b1, c1, d1, e1));
	}

}
