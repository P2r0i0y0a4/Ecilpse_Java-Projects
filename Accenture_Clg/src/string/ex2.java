package string;

public class ex2 {
	public static void main(String[] args) {
		int n=78965;
		int res=0;
		while(n!=0) {
			int digit=n%10;
			res=res*10+digit;
			n=n/10;
		}
		System.out.println(res);
	}

}
