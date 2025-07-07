package arrays;
import java.util.Scanner;
public class S4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		char c=sc.next().charAt(0);
		try {
		switch(c) {
		case '+':
			add(a,b);
			break;
		case '-':
			sub(a,b);
			break;
		case '*':
			mul(a,b);
			break;
		case '/':
			div(a,b);
			break;
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		public static void add(int a,int b) throws Exception{
			System.out.println(a+b);
		}
		public static void sub(int a,int b) throws Exception {
			System.out.println(a-b);
		}
		public static void mul(int a,int b) throws Exception {
			System.out.println(a*b);
		}
		public static void div(int a,int b) throws Exception {
			System.out.println(a/b);
		}
	}
