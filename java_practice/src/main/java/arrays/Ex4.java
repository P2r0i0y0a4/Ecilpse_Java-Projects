package arrays;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size");
	    int[] arr=new int[sc.nextInt()];
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    int sum=0;
	    int count=0;
	    for(int i=0;i<arr.length/2;i++) {
	    	if(i%2==0) {
	    		sum+=arr[i];
	    		count++;
	    	}
	    }
	    int avg=sum/count;
	    System.out.println("Average:"+avg);
	}
}
