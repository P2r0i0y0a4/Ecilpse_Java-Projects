package java_practice;
import java.util.Scanner;

public class Problem {
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int sum=0;
double avg;
int cnt=0;
int arr[]=new int[size];
for(int i=0;i<size;i++) {
	int num=sc.nextInt();
	if(num%2==0) {
		arr[i]=num;
	}
}
for(int i=size/2;i<size;i++) {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sum+=arr[i];
	cnt++;
}
avg=sum/cnt;
System.out.println(avg);
}
}
