package javasession;

public class Factorialnumber {
	public int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact= fact *i;
			//System.out.println("factorial of given number is"+" "+i);
		}
		return fact;
		
	}
	

	public static void main(String[] args) {
		Factorialnumber obj=new Factorialnumber();
		int i=obj.factorial(1);
				System.out.println("Factorial of given number is"+" " +i);

	}

}
