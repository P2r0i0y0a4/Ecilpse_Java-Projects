package string;
import java.util.Scanner;
public class MergeString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students in section A:");
		int n=sc.nextInt();
		sc.nextLine();
		String[] str1=new String[n];
		for(int i=0;i<str1.length;i++) {
			str1[i]=sc.nextLine();
		}
		System.out.print("Enter number of students in section A:");
		int n1=sc.nextInt();
		sc.nextLine();
		String[] str2=new String[n1];
		for(int i=0;i<str2.length;i++) {
			str2[i]=sc.nextLine();
		}
		String[] res=new String[str1.length+str2.length];
		
		/*for(int i=0;i<res.length;i++) {
			System.out.println(str1[i].concat(str2[i]));
		}*/
        for (int i = 0; i < str1.length; i++) {
            res[i] = str1[i];
        }
        for (int i = 0; i < str2.length; i++) {
            res[str1.length + i] = str2[i];
        }
        System.out.println("Combined attendance list:");
        for (String name : res) {
            System.out.println(name);
        }


	}
	
}
