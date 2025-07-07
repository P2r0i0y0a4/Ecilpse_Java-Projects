package string;
import java.util.Arrays;
import java.util.Scanner;
public class Knegation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		Arrays.sort(nums);
		int sum=0;
		k=k%2;
		if(k==1) {
			nums[0]=-nums[0];
		}
		
		for(int i=0;i<n;i++) {
		sum+=nums[i];	
		}
		System.out.println(sum);

	}

}
