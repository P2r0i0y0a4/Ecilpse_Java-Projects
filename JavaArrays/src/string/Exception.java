package string;
import java.util.Scanner;
public class Exception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e) {
			System.out.println("Priya don't divide by zero");
		}
		catch(ClassCastException c) {
			System.out.println("CCE");
		}
		finally {
			System.out.println("Bye");
		}
	}

}

