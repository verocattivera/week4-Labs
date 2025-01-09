package week04;

import java.util.ArrayList;
import java.util.List;

public class codingQuestions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String word1, word2, word3, word4, word5;
//		word1 = "Java";
//		word2 = "JavaScript";
//		word3 = "MySQL";
//		word4 = "HTML";
//		word5 = "SpringBoot";
//		
//		List<String> words = new ArrayList<>();
//		words.add(word1);
//		words.add(word2);
//		words.add(word3);
//		words.add(word4);
//		words.add(word5);
//		
//		halfList(words);
	//******** quesion 13*********//	
		
//		int num1 = -22;
//		int num2 = 2;
//		int num3 = 3;
//		int num4 = 4;
//		int num5 = 5;
//		System.out.println(squaredList(num1,num2,num3,num4,num5));	
		
		
		//******** quesion 14*********//		
		
		char userLetter = 'z';
		
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
		alphabet.add((char) i);
		}
		findLetter(alphabet, userLetter);	
		
			
		
		
		
		
//	dont mess with the baracket
	}	
	
	
	
	
	
	static void findLetter(List<Character> alphabet, char userLetter) {
		
//		 for (int i=0; i < alphabet.size(); i++) {
//			 if(alphabet.get(i) == userLetter) {
//			 System.out.println(i);
//			 return;
//			 }
//		 }
		
		int valueIndex = alphabet.indexOf(userLetter);
		System.out.println(valueIndex);
	}
	
	
	
	
		
//	static List squaredList(int num1, int num2, int num3, int num4, int num5) {
//	 	
//	 List<Integer> squaredNums = new ArrayList<Integer>();
//	
//	 	squaredNums.add(num1*num1);
//	 	squaredNums.add(num2*num2);
//	 	squaredNums.add(num3*num3);
//	 	squaredNums.add(num4*num4);
//	 	squaredNums.add(num5*num5);
//	 
//	 return squaredNums;
//   	
//	}	
		
	
	
//	static void halfList(List<String> words) {
//	    
//		  // WRITE YOUR CODE HERE
//		List<String> newList = new ArrayList<String>();
//		
//		for (String word : words) {
//			if (words.indexOf(word) % 2 == 0) {
//				newList.add(word);
//				
//			}
//			}
//
//
//
//			
//
//
//
//		/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//			System.out.println("The old List is: " + words);
//			System.out.println("The new List is: " + newList);
//		}	

}
