package javasession;

public class Evenoddmethod {
	public boolean eveod(int a) {
		boolean flag =true;
		if(a%2==0) {
			System.out.println("number is even");		
		}
		else {
			System.out.println("number is odd");
			flag =false;
		}
		return flag;
		
	}
	public boolean voterights(int a) {
		boolean flag=true;
		if(a>=18) {
			System.out.println("person is eligible for voting");
		}
		else {
			System.out.println("person is not eligible for voting");
			flag = false;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		 Evenoddmethod obj= new Evenoddmethod(); 
		 boolean f=obj.eveod(3);
		 System.out.println(f);
		 boolean vote =obj.voterights(17);
		 System.out.println(vote);
		 


	}

}
