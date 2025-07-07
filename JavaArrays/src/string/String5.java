package string;
import java.util.Scanner;
public class String5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		String res=" ";
		int max=0;
		for(int i=0;i<str.length;i++) {
			int n=str[i].length();
			if(n>max) {
				max=n;
				res=str[i];
			}
		}
		System.out.println(res);
		
			
	}

}
