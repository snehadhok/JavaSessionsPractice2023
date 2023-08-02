package javasession;

public class LoopsPractice {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			System.out.println("I am Batman");
			i++;
		}

		for (int a = 1; a <= 9; a++) {
			System.out.println("I am Batman" + " " + a);
		}

		int x = 10;
		while (x >= 0) {
			System.out.println(x);
			x--;
		}
		System.out.println("-----------------");
		int y = 10;
		do {
			System.out.println(y);
			y--;
		} while (y >= 0);
		System.out.println("------------");

		for (int z = 10; z >= 1; z--) {
			System.out.println(z);
		}
		System.out.println("===================");

		int b = 1;
		while (b <= 10)
		{
			System.out.println("Hello World");
			b++;
		}

	}

}
