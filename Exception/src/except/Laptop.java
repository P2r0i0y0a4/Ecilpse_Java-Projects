package except;

public class Laptop implements Comparable{
	int price;
	String brand;
	Laptop(int p,String b){
		this.price=p;
		this.brand=b;
	}
	public int compareTo(Object o) {
		Laptop l=(Laptop)o;
		if(this.price<l.price)
			return -1;
		else if(this.price==l.price)
			return 0;
		else
			return 1;
	}
	public String toString() {
		return "[Price : "+this.price+",Brand : "+this.brand+"]";
	}   
}
