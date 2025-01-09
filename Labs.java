package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				// 1. Why would we use a StringBuilder instead of a String?
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<10; i++) {
			if (i != 9) {
				sb.append(i + "-");
			}else 
			{
				sb.append(i); 
			}	
		}
		System.out.println(sb.toString());	
		
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
		
		List<String> listOfString = new ArrayList<String>();
		listOfString.add("VChristina");
		listOfString.add("Vero");
		listOfString.add("Jim");
		listOfString.add("Nicole");
		listOfString.add("VSophia");
		
//		List<String> listofString = Arrays.asList("Jim", "Vero", "Christina", "Nicole", "Sophia");
				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
		System.out.println(findShortestString(listOfString));
				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
//		elementsSwitched(listOfString);
		System.out.println(elementsSwitched(listOfString));
		for (String string : listOfString) {
			System.out.println(string);
		}
		System.out.println("---No. 5-------");
				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
		System.out.println(concatenatedElements(listOfString));
		System.out.println("--No. 6--------");
				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
		
		List<String> searchResult = search(listOfString, "o");
		for(String string : searchResult) {
			System.out.println(string);
		}
//		System.out.println(searchResult);
//		System.out.println(search(listOfString, "o"));
		System.out.println("--No. 7--------");
		
				
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 10, 20, 21, 22, 30);
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
//		System.out.println(sortDivisibleNumbers(numbers));
		for(List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("------------");	
		}
			
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string
		System.out.println("--No. 8--------");	
		
//		System.out.println(calculateStringLenght(listOfString));
		List<Integer> result = calculateStringLenght(listOfString);
		for(Integer number : result) {
			System.out.println(number);
		}
				
				// 9. Create a set of strings and add 5 values
		System.out.println("--No. 9--------");
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Word");
		set.add("Hi");
		set.add("How are you?");
		set.add("Whats up?");
		System.out.println(set);
		for (String value : set) {
			System.out.println(value);
		}
		
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.
		
		System.out.println("--No. 10 --------");
		char c = 'H';
		System.out.println(checkForCharacter(set, c));
		Set<String> stringWithCharacter = checkForCharacter(set, c);
		for(String string : stringWithCharacter) {
			System.out.println(string);
		}
				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
		
		System.out.println("--No. 11 --------");	
		System.out.println(switchSetForList(set));
		List<String> list = (switchSetForList(set));
		for(String string : list) {
			System.out.println(string);
		}

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
		System.out.println("--No. 12 --------");	
		Set<Integer> setNumbers = new HashSet<Integer>();
			setNumbers.add(2);
			setNumbers.add(3);
			setNumbers.add(4);
			setNumbers.add(5);
			setNumbers.add(6);
			setNumbers.add(7);
			setNumbers.add(8);
			setNumbers.add(9);
			setNumbers.add(11);
		
		System.out.println(onlyEvenNumbers(setNumbers));
		Set<Integer> numberResult = onlyEvenNumbers(setNumbers);
		for(Integer number : numberResult) {
			System.out.println(number);
		}
				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word

		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Apple","Red, green, yellow fruit.");
		dictionary.put("Orange", "Orange and citrus fruit.");
		dictionary.put("Strawberry","Red, delicious fruit.");
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println("--No. 14 --------");
		System.out.println(returnValueOfKey(dictionary, "Orange"));
				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
		System.out.println("--No. 15 --------");		
		System.out.println(returnCount(listOfString));
		
		Map<Character, Integer> counts = returnCount(listOfString);
		System.out.println(counts.keySet());
		
		for(Character ch : counts.keySet()) {
			System.out.println(ch);
			System.out.println(ch + "-" +  counts.get(ch));
		}
			}
			
			
			// Method 15:
	public static Map<Character, Integer> returnCount(List<String> list){
		Map<Character, Integer> mapCount = new HashMap<Character,Integer>();
		
		for(String string : list) {
			char c = string.charAt(0);
//			System.out.println(c);
			if (mapCount.get(c) == null) {
//				System.out.println(mapCount.get(c));
				mapCount.put(c, 1);
			} else {
				mapCount.put(c, mapCount.get(c) + 1);
			}
		}
		return mapCount;
	}		
			
			
			// Method 14:
			
	public static String returnValueOfKey(Map<String, String> dictionary, String keyWord) {
		for (String string : dictionary.keySet()) {
			if (string.equals(keyWord)) {
				return dictionary.get(keyWord);	
			}
		}
		return "Not found";
	}
	
			
			// Method 12:
			
	public static Set<Integer> onlyEvenNumbers(Set<Integer> numbers){
		Set<Integer> result = new HashSet<Integer>();
		for (Integer number : numbers) {
			if (number % 2 ==0) {
				result.add(number);
			}
		}
	return result;
	}		
			// Method 11:
	public static List<String> switchSetForList(Set<String> set){
		List<String> result = new ArrayList<String>();
		for(String string : set) {
			result.add(string);
		}
	return result;
	}		


			// Method 10:
	public static Set<String> checkForCharacter(Set<String> set, char c){
		Set<String> result = new HashSet<String>();	
		for (String string : set) {
			if (string.charAt(0)==c) {
				result.add(string);
			};
		}
	return result;
	}		

			
			// Method 8:
	public static List<Integer> calculateStringLenght(List<String> list){
		List<Integer> lenghts = new ArrayList<Integer>();
		for(String string : list) {
//			System.out.println (string);
			lenghts.add(string.length());
//			System.out.println(lenghts);
		}
	return lenghts;	
	}		
	

			
			// Method 7:
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer>list){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<Integer>());
		result.add(new ArrayList<Integer>());
		result.add(new ArrayList<Integer>());
		result.add(new ArrayList<Integer>());
		for (Integer number : list) {
			if (number % 2 == 0) {
				result.get(0).add(number);
			}
			if (number % 3 == 0) {
				result.get(1).add(number);
			}
			if (number % 5 == 0) {
				result.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0  ) {
				result.get(3).add(number);
			}
		}
		return result;
	}

			
			// Method 6:
	public static List<String> search(List<String> list, String aString){
		List<String> result = new ArrayList<String>();
//		System.out.println(list);
//		System.out.println(aString);
		for (String string : list) {
//			System.out.println(string);
//			System.out.println(string.contains(aString));
			if (string.contains(aString)) {
				result.add(string);
//				System.out.println(result);
			}

		}
//		System.out.println(result);
		return result;
	}	

			
			// Method 5:
	public static String concatenatedElements(List<String> list) {
		String concatenated = "";
//		for(String string : list) {
//			concatenated = (concatenated + (string + ","));	
//		}
			
		for (int i= 0; i < list.size(); i++) {
			if (i < (list.size()-1)){
			concatenated = (concatenated + (list.get(i) + ","));
		}else {
			concatenated = (concatenated + (list.get(i)));
		}
		}
	
		return concatenated;
	}		
			
			
			// Method 4:
	public static List<String> elementsSwitched(List<String> List) {
		String firstElement = List.get(0);
		String lastElement = List.get(List.size() - 1);
		List.set(0, lastElement);
		List.set((List.size() - 1), firstElement);
//		System.out.println(firstElement);
//		System.out.println(lastElement);
//		System.out.println(List);
		
		return List;
	}		
			
			
			// Method 3:
			
	public static String findShortestString(List<String> List){
		String shortest = List.get(0);
		String list = List.get(0);
		for (int i = 0; i < List.size(); i++) {
			list = List.get(i);
//			System.out.println(shortest);
//			System.out.println(List.get(i));
//			System.out.println(shortest.length());
			if (list.length() < shortest.length()) {
				shortest = List.get(i);
			}
				
		}
		return shortest;
	}		



}
