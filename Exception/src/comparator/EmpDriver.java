package comparator;

import java.util.Arrays;
import java.util.Comparator;
import except.Employee;

public class EmpDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp= {
				new Employee(1,"Priya","Developer",4500000,"Chennai"),
				new Employee(2,"Riya","PyDeveloper",40000,"Tnagar"),
				new Employee(3,"iniya","JaDeveloper",60000,"Trichy"),
				new Employee(4,"yazhini","SDeveloper",45000,"Bangalore"),
				new Employee(8,"ria","Developer",4000,"Sriperambathur"),
				new Employee(7,"iya","PyDeveloper",400,"Trivanamalai"),
				new Employee(6,"Pragna","JaDeveloper",900,"Anna Nagar"),
				new Employee(10,"Prarthana","SDeveloper",4100,"Lucknow"),
				new Employee(5,"divya","Developer",454,"Mysore"),
				new Employee(9,"Srividya","GDeveloper",78900,"Hyderabad"),
		};
		empIdComparator e1=new empIdComparator();
		Arrays.sort(emp,e1);
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println("================================================");
		empnameComparator e2=new empnameComparator();
		Arrays.sort(emp,e2);
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println("================================================");
		designComparator e3=new designComparator();
		Arrays.sort(emp,e3);
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println("================================================");
		salComparator e4=new salComparator();
		Arrays.sort(emp,e4);
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println("================================================");
		emplocComparator e5=new emplocComparator();
		Arrays.sort(emp,e5);
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
	}
	
}
class empIdComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=null,e2=null;
		if(o1 instanceof Employee && o2 instanceof Employee) {
			e1=(Employee)o1;
			e2=(Employee)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getEmpid()-e2.getEmpid();
	}
}
class empnameComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=null,e2=null;
		if(o1 instanceof Employee && o2 instanceof Employee) {
			e1=(Employee)o1;
			e2=(Employee)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getEmpname().compareTo(e2.getEmpname());
	}
}
class designComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=null,e2=null;
		if(o1 instanceof Employee && o2 instanceof Employee) {
			e1=(Employee)o1;
			e2=(Employee)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getDesignation().compareTo(e2.getDesignation());
	}
}
class salComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=null,e2=null;
		if(o1 instanceof Employee && o2 instanceof Employee) {
			e1=(Employee)o1;
			e2=(Employee)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getSalary()-e2.getSalary();
	}
}
class emplocComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=null,e2=null;
		if(o1 instanceof Employee && o2 instanceof Employee) {
			e1=(Employee)o1;
			e2=(Employee)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getLocation().compareTo(e2.getLocation());
	}
}
