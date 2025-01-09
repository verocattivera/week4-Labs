package week04;

import java.util.ArrayList;
import java.util.List;

public class codingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/***Question 1****/	
//		List<Integer> listNums = new ArrayList<>();
//		int endNum = 10;
//		for (int i = 1; i <= endNum; i++) {
//		    listNums.add(i);
//		}
//	/***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//	    // WRITE YOUR CODE HERE
//		System.out.println(listNums);
		
		
//		/***Question 3****/		
//		List<String> productList = new ArrayList<>(); 
//		int indexVal = 5;
//		productList.add("Macbook");
//		productList.add("HP Notebook");
//		productList.add("iPhone 14");
//		productList.add("Acer Aspire");
//		productList.add("Windows Surface");
//		productList.add("Galaxy S23");	
////		System.out.println(productList.size());
////		System.out.println(indexVal);
////		System.out.println(productList.size()<= indexVal);
//		
//		if (indexVal >= 0 && indexVal < productList.size())  {
//			System.out.println(productList.get(indexVal));	
//		}else {
//			System.out.println("No product can be found with that product number.");
//		}
		
//		/***Question 5****/		
//		
//		
//		
//		int num1 = -1;
//		int num2 = 0;
//		int num3 = 1;
//		
//		List<String> tenWords = new ArrayList<String>();
//		tenWords.add("Bumfuzzle");
//		tenWords.add("Cattywampus");
//		tenWords.add("Widdershins");
//		tenWords.add("Gubbins");
//		tenWords.add("Lollygag");
//		tenWords.add("Malarkey");
//		tenWords.add("Wabbit");
//		tenWords.add("Impignorate");
//		tenWords.add("Yarborough");
//		tenWords.add("Bloviate");
//		
//		wordReplace(tenWords, num1, num2, num3);
//		
		
//		/***Question 7****/		
//		int num1, num2, num3, num4;
//		num1 = 5;
//		num2 = 5;
//		num3 = 5;
//		num4 = 5;
//		sumList(num1, num2, num3, num4);
		
		/***Question 7****/		
		
		int endNum = 10;
		
		beginEnd(endNum);	
		
		
		
		
		
		/***** DO NOT CHANGE THE curly bracket *****/	
	}
	
	
//	static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {
//		
//	    // WRITE YOUR CODE HERE
//
//		List<String> threeWords = new ArrayList<String>();
//		if (num1 >= 0 && num1<10 && num2 >= 0 && num2<10 && num3 >= 0 && num3<10) {
//		threeWords.add(tenWords.get(num1));
//		threeWords.add(tenWords.get(num2));
//		threeWords.add(tenWords.get(num3));
//		System.out.println(threeWords);
//		}else
//			System.out.println("Sorry, there was an error gettin a number you requested.");
//		}

//	static void sumList(int num1, int num2, int num3, int num4) {
//		
//	   List<Integer> allNumbers = new ArrayList<Integer>();
//	   		int sum = num1 + num2 + num3 + num4;
//	   		allNumbers.add(num1);
//	   		allNumbers.add(num2);
//	   		allNumbers.add(num3);
//	   		allNumbers.add(num4);
//	   		allNumbers.add(sum);
//	   		System.out.println(allNumbers);
//	   
//	   
//
//
//
//
//
//
//
//
//		
//	
//	}

	static void beginEnd(int endNum) {

		List<Integer> newList = new ArrayList<Integer>();
		if (endNum > 0){
			for(int i=1; i <= endNum; i++) {
				newList.add(i);
				}
			System.out.println("The first number in the List is " + newList.getFirst());
			System.out.println("The last number in the List is " + newList.getLast());
		}else
			{
			System.out.println("Your List cannot be created with a number less than one.");
			}




	}
	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
	}




