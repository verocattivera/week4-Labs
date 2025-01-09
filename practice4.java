package week04;

import java.util.HashSet;
import java.util.Set;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";

		System.out.println(firstName);
		System.out.println(lastName);

		StringBuilder sb = new StringBuilder();

		// use append() to dynamically create a String using StringBuilder 
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());

		// Add a middle Initial
		sb.insert(firstName.length()+1, middleInitial + space);
		System.out.println(sb.toString());
		
		Set<String> vegetables = new HashSet<String>();

		vegetables.add("Carrot");
		System.out.println(vegetables);
		vegetables.add("Onion");
		System.out.println(vegetables);
		vegetables.add("Broccoli");
		System.out.println(vegetables);
		vegetables.add("Asparagus");
		System.out.println(vegetables);
		vegetables.add("Carrot");
		System.out.println(vegetables);

		vegetables.add(null);
		System.out.println(vegetables);

		vegetables.add(null);
		System.out.println(vegetables);

		System.out.println("The size of our set is: " + vegetables.size());
		}
	

		
		


}
