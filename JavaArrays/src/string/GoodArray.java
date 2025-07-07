package string;
import java.util.Arrays;
import java.util.Scanner;
public class GoodArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(arr[i]==i+1) {
				continue;
			}
			else {
				System.out.println("False");
			}
			if(arr[n-1]==n-1) {
				System.out.println("true");
			}
		}
	}

}
