package except;
import java.util.Scanner;
public class BannedWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		System.out.println("Enter Target");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<n;i++) {
			if(s.equals(str[i])) {
				count++;
			}
		}
		System.out.println(count);
	}

}
