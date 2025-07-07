package arrays;
import java.util.Scanner;
public class Count1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i+=2) {
			count++;
			if(count%2==0) {
				System.out.print(count);
			}
		}
	}
}
