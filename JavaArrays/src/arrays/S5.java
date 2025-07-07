package arrays;
import java.util.Scanner;
public class S5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(maxCount(arr));
	}
	public static int maxCount(int[] arr) {
		int maxcount=0,count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
			else {
				maxcount=Math.max(maxcount, count);
				count=1;
			}
		}
		return Math.max(maxcount, count);
	}

}
