package string;

import java.util.Scanner;
public class String4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		String res=" ";
		for(int i=str.length-1;i>=0;i--) {
			if(str[i]==" ")
				continue;
			
			else {
				res+=str[i];
			}
		}
		String result=res.stripLeading();
		String result2=result.stripTrailing();
		System.out.print(result2+" ");
		
	}
}
