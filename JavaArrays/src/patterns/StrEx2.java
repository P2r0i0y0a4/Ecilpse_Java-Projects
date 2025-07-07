package patterns;
import java.util.Scanner;
public class StrEx2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int
		String str=sc.nextLine();
		int count1=0;
		int count2=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=="a"|| str.charAt(i)=="e"|| str.contains("I")|| str.contains("O")|| str.contains("U")|| str.contains("a")||str.contains("e")||str.contains("i")|| str.contains("o")||str.contains("u")) {
				count1++;
			}
			else if(!str.contains("A")|| !str.contains("E")||! str.contains("I")||! str.contains("O")||! str.contains("U")|| !str.contains("a")||!str.contains("e")||!str.contains("i")|| !str.contains("o")||!str.contains("u")) {
				count2++;
			}
		}
		System.out.print(count1 +" "+ count2);
		
	}

}
