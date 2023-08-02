package javasession;

public class Maxminmethod {
	public int maxnum(int a, int b, int c) {
		System.out.println("printing maximum number");
		int max = a;
		if (max >= b) {
			if (max >= c) {
				System.out.println("maximum number is" + " " + max);
			} else {
				System.out.println("maximum number is" + " " + c);
				max = c;
			}
		} else {
			if (b >= c) {
				System.out.println("maximum number is" + " " + b);
				max = b;
			} else {
				System.out.println("maximum number is" + " " + c);
				max = c;
			}
		}
		return max;
	}

	public int minimum(int a, int b, int c) {
		System.out.println("printing maximum number");
		int min = a;
		if (min <= b) {
			if (min <= c) {
				System.out.println("minumum number is" + " " + min);
			} else {
				System.out.println("minumum number is" + " " + c);
				min = c;
			}
		} else {
			if (b <= c) {
				System.out.println("minumum number is" + " " + b);
				min = b;
			} else {
				System.out.println("minumum number is" + " " + c);
				min = c;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Maxminmethod obj = new Maxminmethod();
		int d = obj.maxnum(50, 8, 10);
		System.out.println(d);
		int d1 = obj.minimum(100, 200, 30);
		System.out.println(d1);

	}

}
