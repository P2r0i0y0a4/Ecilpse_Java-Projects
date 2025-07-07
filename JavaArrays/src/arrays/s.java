package arrays;
import java.util.*;
public class s {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int k=3;
		reverseKTimes(arr,k);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
	public static void reverseKTimes(int[] arr,int k) {
		int n=arr.length;
		for(int i=0;i<arr.length;i+=k) {
			int left=i;
			int right=Math.min( i+k-1, n-1);
			while(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			
		}
	}

}
