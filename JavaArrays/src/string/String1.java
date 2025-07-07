package string;
import java.util.Scanner;
public class String1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		for(int i=0;i<str.length;i++) {
			if(str[i].startsWith("a") || str[i].startsWith("A")) {
				System.out.println(str[i]);
				continue;
			}
			else {
				System.out.println("No match Found");
			}
		}
	}

}
