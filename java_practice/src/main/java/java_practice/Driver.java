package java_practice;

public class Driver {
	public static void main(String[] args) {
		employee_nonstatic e= new employee_nonstatic(5,"Sri");
		employee_nonstatic e1=new employee_nonstatic(10,"priya");
		employee_nonstatic e2=new employee_nonstatic(15,"piua");
		employee_nonstatic e3=new employee_nonstatic(20,"iya");
		employee_nonstatic e4=new employee_nonstatic(25,"riya");
		
		System.out.println(e.eid+" "+e.name);
		System.out.println(e1.eid);
		System.out.println(e1.name);
		System.out.println(e2.eid+" "+e2.name);
		System.out.println(e3.eid); 
		System.out.println(e3.name);
		System.out.println(e4.eid+" "+e4.name);
	}
}
