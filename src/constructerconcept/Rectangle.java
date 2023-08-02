package constructerconcept;

public class Rectangle {
	double length;
	double width;

	public Rectangle(double lw) {
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double areaofrectangle(double l, double w) {
		double area = l * w;
		return area;
	}

	public static void main(String[] args) {
		Rectangle calarea = new Rectangle(0.0);
		System.out.println(calarea.length + " " + calarea.width);
		double area1 = calarea.areaofrectangle(0.0, 0.0);
		System.out.println(area1);

		Rectangle calarea1 = new Rectangle(4.5, 5.5);
		System.out.println(calarea1.length + " " + calarea1.width);
		double area = calarea1.areaofrectangle(4.5, 5.5);
		System.out.println(area);

	}

}
