package one;

import java.util.Objects;

public class Panimalar {
	String dept;
	int fees;
	int student_count;
	public Panimalar(String dept, int fees, int student_count) {
		super();
		this.dept = dept;
		this.fees = fees;
		this.student_count = student_count;
	}
	@Override
	public String toString() {
		return "Panimalar [dept=" + dept + ", fees=" + fees + ", student_count=" + student_count + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(fees);
	}
	@Override
	public boolean equals(Object obj) {
		Panimalar p = (Panimalar) obj;
		return this.fees == p.fees;
	}
	

}
