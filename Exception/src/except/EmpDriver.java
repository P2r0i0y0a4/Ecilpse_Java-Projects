package except;

import java.util.Arrays;

public class EmpDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp= {
				new Employee(1,"Priya","Developer",4500000,"Chennai"),
				new Employee(2,"Riya","PyDeveloper",40000,"Tnagar"),
				new Employee(1,"iniya","JaDeveloper",60000,"Trichy"),
				new Employee(1,"yazhini","SDeveloper",45000,"Bangalore"),
				new Employee(1,"ria","Developer",4000,"Sriperambathur"),
				new Employee(1,"iya","PyDeveloper",400,"Trivanamalai"),
				new Employee(1,"Pragna","JaDeveloper",900,"Anna Nagar"),
				new Employee(1,"Prarthana","SDeveloper",4100,"Lucknow"),
				new Employee(1,"divya","Developer",454,"Mysore"),
				new Employee(1,"Srividya","GDeveloper",78900,"Hyderabad"),
		};
		Arrays.sort(emp);
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}

	}

}
