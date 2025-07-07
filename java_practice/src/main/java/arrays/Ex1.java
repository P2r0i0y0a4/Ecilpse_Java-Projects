package arrays;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		double avg=0;
		int sum=0,count=0;
		for(int i=arr.length/2+1;i<arr.length;i++) {
			if(i%2!=0) {
				sum+=arr[i];
				count++;
			}
			avg=sum/count;
		}
		System.out.println("Average of Odd indexed in second half is:"+" "+avg);
	}
}
