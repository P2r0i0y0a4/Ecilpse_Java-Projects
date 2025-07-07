package java_practice;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%3==0) System.out.print("Fizz");
		else if(n%5==0) System.out.print("Buzz");
		if(n%3==0 && n%5==0) System.out.print("FizzBuzz");
		else System.out.print(n);
	}
}
