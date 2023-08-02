package encapsulation;

public class Test {

	public static void main(String[] args) {
		BankAccount instance = new BankAccount();
		instance.setAccno("12345sdsdgrjgk9087");
		
		instance.setBalance(35000);
		
		instance.setOwner("Sneha");
		
		instance.printStatement();
		
		double balance = instance.deposit(2000);
		
		System.out.println(balance);
		
		double updatebalance = instance.withdraw(1000);
		
		System.out.println(updatebalance);

	}

}
