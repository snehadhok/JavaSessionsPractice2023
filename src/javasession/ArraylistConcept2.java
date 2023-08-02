package javasession;

import java.util.ArrayList;

public class ArraylistConcept2 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("pink");
		colors.add("green");
		colors.add("red");
		colors.add("purple");
		colors.add("gray");
		colors.add("orange");
		System.out.println(colors);
		// Write a Java program to extract a portion of an array list
		ArrayList<String> portion = new ArrayList<>(colors.subList(2, 4));
		System.out.println(portion);
		
		
		//Write a Java program to empty an array list.
		System.out.println(colors);
		colors.clear();
		System.out.println(colors);
		colors.trimToSize();
		
		
	}

}
