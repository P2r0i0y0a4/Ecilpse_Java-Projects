package string;

import java.util.Arrays;
import java.util.Scanner;

public class Str13 {
	public static void printStrings(String[] arr)
	{
		Arrays.sort(arr);
		
		
		
		 for (int i = 0; i < arr.length; i++) {
	            if (arr[i]!=null) {
	                int len = arr[i].length();
	                for (int j = i; j < arr.length; j++) {
	                    if (arr[j]!=null && arr[j].length() == len) {
	                        System.out.print(arr[j] + " ");
	                        arr[j] = null;
	                    }
	                }
	                System.out.println();
	            }
	        }

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		printStrings(str);
	}
}

