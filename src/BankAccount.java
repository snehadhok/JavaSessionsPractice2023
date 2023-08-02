
public class BankAccount {
	int accno;
    double balance;
	public BankAccount(int accno, double balance) {
		this.accno = accno;
		this.balance = balance;
	}
	public double deposit(double dp) {
		double dpbalance=balance+dp;
		return dpbalance;
	}
	public double withdraw(double dp) {
		double dpbalance=balance-dp;
		return dpbalance;
	}

    
}

