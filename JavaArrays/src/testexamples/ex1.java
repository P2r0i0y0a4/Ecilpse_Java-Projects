package testexamples;
/*1.--------------------------output is ClassCastExcption----------------------
public class ex1 {
	public void call() {
		System.out.println("A");
	}
}
class ex2 extends ex1{
	public void call() {
		System.out.println("B");
	}
}
class ex3 extends ex1{
	public void call() {
		System.out.println("C");
	}
}
class Driver{
	public static void main(String[] args) {
		ex1 ex1=new ex3();
		(((ex2)ex1).call);
	}
}*/
/*2.----------------------------output is CTE--------------------
class Book{
	String name;
	Book(String name){
		this.name=name;
	}
}
class Author {
	String name;
	Author(String name){
		this.name=name;
	}
}
class Driver{
	public static void main(String[] args) {
		Book b=new Book("Kathy");
		b.author.name="Sierren";
		System.out.println(b.author.name);
	}
}*/
/*3=------------------------------output is 10--------
class Box{
	int size=20;
}
class Driver{
	public static void main(String[] args) {
		Box a=new Box();
		Box b=a;
		b.size=10;
		System.out.println(a.size);
	}
}*/
/*4.--------------------------------output as 15-----------
class Test{
	int val=5;
	public static void main(String[] args) {
		Test a=new Test();
		Test b=new Test();
		b.val=10;
		a=b;
		b.val=15;
		System.out.println(a.val);
	}
}*/