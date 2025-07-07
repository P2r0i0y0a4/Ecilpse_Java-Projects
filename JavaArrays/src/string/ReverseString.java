package string;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.trim();
		String[] ans=str.split(" ");
		for(int i=ans.length-1;i>=0;i--) {
			System.out.print(ans[i]+" ");
		}
	}

}
