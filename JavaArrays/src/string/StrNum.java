package string;

import java.util.Scanner;
public class StrNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="123456789";
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)>='0'&& str.charAt(i)<='9')) {
				flag=true;
				break;
			}
		}
		System.out.println(!flag);
		
	}
	
}

