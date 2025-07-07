package except;
import java.util.Arrays;
public class LapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop[] l= {
				new Laptop(10000,"HP"),
				new Laptop(20000,"Samsung"),
				new Laptop(15000,"Lenovo"),
				new Laptop(30000,"HP"),
				new Laptop(25000,"Samsung")
		};
		Arrays.sort(l);
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
		}
	}

}
