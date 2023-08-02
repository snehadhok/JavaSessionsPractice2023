
public class Banktest {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount(123456789, 30000);
		double balance=ba.deposit(3000.0);
		System.out.println(balance);
		
		double currenbalance=ba.withdraw(1000.0);
		System.out.println(currenbalance);
		
		

	}

}
