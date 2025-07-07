package Abstract;

public class BankDriver {
	public static void main(String[] args) {
		System.out.println("Saving Account ");
		SavingAccount s=new SavingAccount(10000,"Saving");
		s.showBalance();
		s.bankAccountType();
		System.out.println("========================");
		System.out.println("Current  Account ");
		CurrentAccount c=new CurrentAccount(20000,"Current");
		c.showBalance();
		c.bankAccountType();
	}
}

abstract class BankAccount{
	abstract public void showBalance();
	abstract public void bankAccountType();
}
class SavingAccount extends BankAccount{
	int bankbalance;
	String bankType;
	SavingAccount(int b,String t){
		this.bankbalance=b;
		this.bankType=t;
	}
	public void showBalance() {
		System.out.println(this.bankbalance);
	}
	public void bankAccountType() {
		System.out.println(this.bankType);
	}
}

class CurrentAccount extends BankAccount{
	int bankbalance;
	String bankType;
	CurrentAccount(int b,String t){
		this.bankbalance=b;
		this.bankType=t;
	}
	public void showBalance() {
		System.out.println(this.bankbalance);
	}
	public void bankAccountType() {
		System.out.println(this.bankType);
	}

}