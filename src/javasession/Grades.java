package javasession;

public class Grades {
	public String Marks(int a) {
		String grade=" ";
		if(a>=91 && a<=100) {
			System.out.println("your grade is "+" "+grade);
			grade ="AA";
		}
		else if(a>=81 && a<=90){
			System.out.println("your grade is "+" "+grade);
			grade ="AB";	
		}
		else if(a>=71 && a<=80){
			System.out.println("your grade is "+" "+grade);
			grade ="BB";	
		}
		else if(a>=61 && a<=70){
			System.out.println("your grade is "+" "+grade);
			grade ="BC";	
		}
		else if(a>=51 && a<=60){
			System.out.println("your grade is "+" "+grade);
			grade ="CD";	
		}
		else if(a>=41 && a<=50){
			System.out.println("your grade is "+" "+grade);
			grade ="DD";	
		}
		else if(a<=40){
			System.out.println("your grade is "+" "+grade);
			grade ="Fail";	
		}
		return grade;
		
	}
	
	public static void main(String[] args) {
		Grades obj=new Grades();
		String marks=obj.Marks(35);
		System.out.println(marks);
		
	}

}
