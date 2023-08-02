package constructerconcept;

public class Person {
	String name;
	int age;
	char gender;
	double height;
	
	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {
		Person obj = new Person("sneha", 30, 'f', 4.9);
		System.out.println(obj.name+" "+obj.age+" "+obj.height+" "+obj.gender);
		Person obj1 = new Person("Yadnesh", 2, 'm', 3.0);
		System.out.println(obj1.name+" "+obj1.age+" "+obj1.height+" "+obj1.gender);
		
	

	}

}
