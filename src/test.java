
public class test {

	public static void main(String[] args) {
		Employee emp1 = new Employee(01, "sneha", 9.5);
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
		emp1.setSalary(10.45);
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		Car c1=new Car();
		System.out.println(c1);
		
		Car c2=new Car("creta","night edition" , 2023);
		System.out.println(c2.getMake());
		System.out.println(c2.getModel());
		System.out.println(c2.getYear());
				
		
		
		
		
		
		

	}

}
