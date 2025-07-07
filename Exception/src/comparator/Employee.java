package comparator;

public class Employee {
	private int empid;
	private String empname;
	private String designation;
	private int salary;
	private String location;
	public Employee(int empid, String empname, String designation, int salary, String location) {
		this.empid = empid;
		this.empname = empname;
		this.designation = designation;
		this.salary = salary;
		this.location = location;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee[ Emp Id: "+ empid +"  Emp name: "+ empname +" Designation: "+ designation +" Salary: "+ salary +" Location: "+ location +"]";
	}

}
