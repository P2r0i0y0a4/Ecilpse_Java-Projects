package methodOverloading;

public class Demo {
	public static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static int add(int a,int b, int c) {
		int res=a+b+c;
		return res;
	}
    public static int add(int a,int b,int c,int d) {
		int cd=a+b+c+d;
		return cd;
    }
    public static int add(int a,int b,int c,int d,int e) {
		int ce=a+b+c+d+e;
		return ce;
    }
    public static void main(String[] args) {
		System.out.println(add(2,3));
		System.out.println(add(4,5));
		System.out.println(add(2,3,4));
		System.out.println(add(2,3,4,5));
		System.out.println(add(2,3,4,5,6));
    }
}
