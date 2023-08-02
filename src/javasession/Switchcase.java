package javasession;

public class Switchcase {

	public static void main(String[] args) {
		//4 programs are remaining plz check in the assignment
		char c='f';
		switch (c) {
		case 'a':
			System.out.println("given alphabet is vowel");
			break;
		case 'e':
			System.out.println("given alphabet is vowel");
			break;
		case 'i':
			System.out.println("given alphabet is vowel");
			break;
		case 'o':
			System.out.println("given alphabet is vowel");
			break;
		case 'u':
			System.out.println("given alphabet is vowel");
			break;
		default:
			System.out.println("given alphaber is consonent");
			break;
		}
		String loanType = "Car Loan";
        double salary = 40000;
        double interestRate;

        switch (loanType) {
            case "Car Loan":
                interestRate = 6.5;
                break;
            case "Housing Loan":
                if (salary < 35000) {
                    System.out.println("NOT APPLICABLE FOR Housing Loan");
                    return;
                }
                interestRate = 7.5;
                break;
            case "Personal Loan":
                interestRate = 10.0;
                break;
            case "Education Loan":
                interestRate = 8.0;
                break;
            default:
                System.out.println("Invalid loan type");
                return;
        }

        System.out.println("Interest rate for " + loanType + " is " + interestRate + "%");
    
        String env=" STAGE ";
		switch (env.trim().toLowerCase()) {
		case "qa":
			System.out.println("plz run the test cases on qa env");
			break;
		case "stage" :
			System.out.println("plz run the test cases on stage env");
			break;
		case "dev":
			System.out.println("plz run the test cases on dev env");
			break;
		case "prod":
			System.out.println("plz run the test cases on prod env");
			break;
		case "uat":
			System.out.println("plz run the test cases on uat env");
			break;
		default:
			System.out.println("plz pass the correct env");
			break;
		}
		
		
	}
}
