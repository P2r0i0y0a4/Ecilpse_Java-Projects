package arrays;
import java.util.Scanner;
public class S3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int choice=sc.nextInt();
		int index=sc.nextInt();
		try {
			for(int i=0;i<arr.length;i++) {
				//if(arr[i]==index) {
					System.out.println(arr[index]/choice);
			    //}
			}
		}
		catch(ArithmeticException e) {
			System.out.println(" don't Divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index reached out of bounds");
		}
	}

}
