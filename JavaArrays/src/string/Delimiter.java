package string;
import java.util.Scanner;
public class Delimiter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of words:");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("reads the words:");
		String[] a=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLine();
		}
		System.out.println("Enter delimiter:");
		String delimiter=sc.nextLine();
		String res=String.join(delimiter, a);
		System.out.print(res);
	}

}
