package string;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="12234a3456";
		System.out.println(checkNum(str));
	}
	public static boolean checkNum(String str) {
		boolean flag=true;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0'&& ch<='9') {
				continue;
			}
			else {
				flag=false;
				break;
			}
		}
		return flag;
	}

}
