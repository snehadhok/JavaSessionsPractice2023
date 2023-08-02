package encapsulation;

public class BankAccount {
	private String accno;
    private double balance;
    private String owner;
    
		public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void printStatement() {
		System.out.println("BankAccount related informantion is"+ accno + " "+balance +" "+owner);
			
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



