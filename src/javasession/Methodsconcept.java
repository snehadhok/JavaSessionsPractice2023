package javasession;

public class Methodsconcept {

	// .Write a program to print the addition/subtraction/division/multiplication of
	// two numbers entered by user by defining your own method
	public int add(int a, int b) {
		System.out.println("printing addition of two numbers");
		int c = a + b;
		return c;
	}

	public int subs(int x, int y) {
		System.out.println("printing substraction of two numbers");
		int z = x - y;
		return z;
	}

	public long mul(int p, int q) {
		System.out.println("printing multiplication of two numbers");
		int s = p * q;
		return s;
	}

	public float div(int a, int b) {
		System.out.println("printing division of two numbers");
		int c = a / b;
		return c;

	}
	public double product(double a,double b) {
		System.out.println("product of two double numbers");
		double c= a*b;
		return c;
	}
	public double area(int r) {
		System.out.println("area of circle");
		double c=3.14*r*r;
		return c;
	}
	public double circumference(int r) {
		System.out.println("circumference of circle");
		double c=2*3.14*r;
		return c;
	}
	
	public static void main(String[] args) {
		Methodsconcept obj = new Methodsconcept();
		int d = obj.add(10, 20);
		System.out.println(d);
		int sub = obj.subs(20, 10);
		System.out.println(sub);
		long mul = obj.mul(200, 300);
		System.out.println(mul);
		float divs = obj.div(10, 2);
		System.out.println(divs);
		double pro=obj.product(2.5, 3.5);
		System.out.println(pro);
		double ar=obj.area(2);
		System.out.println(ar);
		double cum=obj.circumference(4);
		System.out.println(cum);

	}

}
