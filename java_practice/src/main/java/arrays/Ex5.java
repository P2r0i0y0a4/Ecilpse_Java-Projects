package arrays;
import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		    if(count==1) {
		    	System.out.println(arr[i]);
		    }
		}
	}
}
