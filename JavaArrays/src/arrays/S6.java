package arrays;
import java.util.*;
public class S6 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	moveAllZeros(arr);
	for(int num:arr)
	System.out.print(num+" ");
	}
	public static void moveAllZeros(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
			arr[count++]=arr[i];
		}
		while(count<arr.length) {
			arr[count++]=0;
		}
	}

}
