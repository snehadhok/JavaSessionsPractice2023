package javasession;

public class Incrementdecrement {

	public static void main(String[] args) {
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);

		int a = 0;
		a = a++ - --a + ++a - a--;
		System.out.println(a);
		
		int p = 1, q = 2, r = 3;
		int s = p-- - q-- - r--;
		System.out.println("p=" + p);
		System.out.println("q=" + q);
		System.out.println("r=" + r);
		System.out.println("s=" + s);

		int x = 19, y = 29, z;
		z= x-- -x++ + --y -++y + --x - y-- - ++x -y++;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		System.out.println("-----------------------------");
		
		int m = 0, n = 0;
		int p1 = --m * --n * n-- * m--;
		System.out.println(p1);
		System.out.println(m);
		System.out.println(n);

		int a1 = 1;
		a1 = a1++ + ++a1 * --a1 - a1--;
		System.out.println(a1);

		int ch = 'A';
		System.out.println(ch++);
		System.out.println(++ch);
		
		
		Double u=1.5, U=2.5;
		System.out.println(u++ + ++U);
		
		
		
		
		
		
		

	}

}