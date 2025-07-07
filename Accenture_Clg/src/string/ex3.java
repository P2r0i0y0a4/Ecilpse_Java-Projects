package string;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		moveArray(arr);
		for(int num:arr) {
			System.out.println(num);
		}
	}
	public static void moveArray(int[] arr) {
		int n=arr.length;
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<n) {
			arr[index]=0;
			index++;
		}
			
	}
}

