package string;
import java.util.Scanner;
public class UppercaseCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<str.length;i++) {
			str[i]=sc.nextLine();
		}
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(str[i].toUpperCase())) {
				System.out.print(str[i]+" ");
			}
		}
	}

}

