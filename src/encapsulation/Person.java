package encapsulation;

public class Person {
	private String name;
	private String gender;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void printInfo() {
		System.out.println("Person name is"+" "+name);
		System.out.println("Person name is"+" "+gender);
		System.out.println("Person name is"+" "+age);
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("sneha");
		p.setGender("female");
		p.setAge(30);
		
		p.printInfo();
	

	}

}
