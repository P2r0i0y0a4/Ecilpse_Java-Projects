package java_practice;

public class BranchDriver {
	public static void main(String[] args) {
		/*Branch b=new Branch("Smith",21019);
		System.out.println(b.manager_name+" "+b.ifsc);
		*/
		Branch b=new Branch();
		b.setManager_name("Smith");
		System.out.println("Manager name:"+" "+b.getManager_name());
		b.setIfsc(10121);
		System.out.println(b.getIfsc());
	}
}
