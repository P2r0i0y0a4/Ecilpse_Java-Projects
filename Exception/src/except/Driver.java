package except;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Uber u=null;
		System.out.println("Enter choice");
		System.out.println("1. Mini\n2. Seden\n3. Luxury");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			u=new Mini();
			break;
		}
		case 2:{
			u=new Seden();
			break;
		}
		case 3:{
			u=new Luxury();
			break;
		}
	}
	try {
		Mini m=(Mini)u;
		m.setPrice(3);
		System.out.println(m.getPrice()*50);
	}
	catch(ClassCastException e) {
		System.out.println("Not Mini Type");
	}
	catch(NullPointerException e) {
		System.out.println("Wrong Option selected");
	}
	finally {
		System.out.println("Bye");
	}
}

}
