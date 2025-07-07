package settt;

public class Emp {
	int empid;
	String empname;
	String dept;
	public Emp(int empid, String empname, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return this.empid+""+this.empname+this.dept;
	}
	@Override
	public boolean equals(Object obj) {
		return this.empid==((Emp)obj).empid && this.empname.equals((Emp)obj).empname && this.dept.equals((Emp)obj).dept;
	}
	@Override
	public int hashCode() {
		return ((Integer)empid).hashCode();
	}
}
