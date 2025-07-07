package string;
import java.util.Arrays;
import java.util.Scanner;
public class Str11 {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		System.out.println(getPrefix1(str));
	}
	public static String getPrefix1(String[] words)
	{
		Arrays.sort(words);// Sort and compare
		
		String first = words[0];
		String last = words[words.length-1];
		int i=0;
		while(i<first.length()&&i<last.length()&&first.charAt(i)==last.charAt(i))
		{
			i++;
		}
		return first.substring(0,i);
	}

}
