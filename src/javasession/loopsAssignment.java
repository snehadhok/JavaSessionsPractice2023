package javasession;

public class loopsAssignment {

	public static void main(String[] args) {
		int b = 1;
		while (b <= 10) {
			System.out.println("Hello World");
			b++;
		}
		int s = 1;
		int num = 5;
		while (s <= 100) {
			if (s % num == 0) {
				System.out.println(s);
			}
			s++;
		}

		System.out.println("=================");
		for (int s2 = 1; s2 <= 100; s2++) {
			if (s2 % 5 == 0) {
				System.out.println(s2);
			}
		}

		int x = 0;
		int num1 = 9;
		do {
			if (x % num1 == 0) {
				System.out.println(x);
			}
			x++;
		} while (x <= 100);
		// for for-loop see loopsconcept2 codes
		char a = 'a';
		while (a <= 'z') {
			System.out.println(a + " " + (int) a);
			a++;
		}

		char c = 'a';
		while (c <= 'z') {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println(c);
				c++;
//wap to print only vowels using for loop,loop start from a upto z
				
			}
		}
		

	}
}
