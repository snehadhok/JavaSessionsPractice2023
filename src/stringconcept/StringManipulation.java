package stringconcept;

public class StringManipulation {

	public static void main(String[] args) {
		String a = "sneha";
		String b = "sneha";
		int n = a.length();
		String s = new String("sneha");
		System.out.println(a == b);
		System.out.println(a.equals(s));
		String s1 = " Hello Everyone ";
		String s2 = "this is my java code";
		System.out.println(s1.trim());
		s1 = s1.replace(" ", "");
		System.out.println(s1);
		// first &last
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(n - 1));
		// contains method to find the string
		System.out.println(s2.contains("java"));
		// reverse of our name
		String rev = "";
		for (int i = n - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
		// last half of the string
		System.out.println(s2.substring(s2.length() / 2, s2.length()));
		// to find the third occurence
		String str = "Welcome to Naveen Automation Labs ! ";
		System.out.println(str.indexOf('e'));

		System.out.println(str.indexOf("e", str.indexOf("e") + 1));
		System.out.println(str.indexOf("e", (str.indexOf("e", str.indexOf("e") + 1) + 1)));
		System.out.println(str.indexOf("e", (str.indexOf("e", (str.indexOf("e", str.indexOf("e") + 1) + 1))) + 1));
		System.out.println("--------------------------------");
		// int len=str.length();
		//for(int i=0;i<len;i++) {
//			if(str.charAt(i)=='e') {
		//	System.out.println(str.indexOf(i));
		//	}
		}
			

	}


