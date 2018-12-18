import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class exercise1 {

	public static void main(String[] args) {
		//powersOfTwo();
		//alarm(8);
		//System.out.println(sum100());
		//System.out.println(sumRange(8, 16));
		//System.out.println(maxOfTwo(20, 18));
		//System.out.println(larger(300, 300));
		//System.out.println(countA("Mary Bratt has a great attitude"));
		//System.out.println(evenlyDivisible(20, 5));
		//System.out.println(average(1000, 500, 200, 500, 300));
		//System.out.println(multiConcat("hello", 3));
		//System.out.println(isAlpha('2'));
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter a number between 1 and 100");
		//int checkNumber = input.nextInt();
		//System.out.println("The number you entered was valid. Your number was " + validate(1, 100, checkNumber));
		//System.out.println(floatEquals(1.000f, 2.000f, 0.4900f));
		// System.out.println(reverse("Mary Bratt"));
		//System.out.println(isIsosceles(10, 10, 6));
		//System.out.println(randomInRange(1, 300));
		System.out.println(randomInRange(50));
	}
	/**
	 *  #1 Write a method called powersOfTwo that prints 
	 * the first 10 powers of 2 (starting with 2). 
	 * The method takes no parameters and doesn't return anything
	 */
	public static void powersOfTwo() {
		int powers = 2; //sets the number used as the power
		int total = 1; //initializes the total
		// loop 10 times and multiply the powers by the running total
		for(int i = 1; i <= 10; i++) {
			total =  powers * total;
			System.out.println(total);
		}
	}
	
	/**
	 *  #2 Write a method called alarm that prints the word “Alarm!”
	 *  multiple times on separate lines. The method should accept 
	 *  an integer parameter that specifies how many times the output 
	 *  line is printed.
	 * @param a - how many times does the Alarm print
	 */
	public static void alarm(int a) {
		for(int i = 1; i <= a; i++) {
			System.out.println("Alarm!");
		}
	}
	
	/**
	 * #3 Write a method called sum100 that returns the sum of the integers from 1 to 100.
	 * 	
	 * 
	 * @return - sum of integers 1 to 100
	 */
	
	public static int sum100() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	/*
	 *  #4 Write a method called sumRange that accepts two integer parameters 
	 *  that represent a range. You may assume the first parameter is less 
	 *  than or equal to the second. The method should return the sum of the 
	 *  integers in that range.
	 *
	 * @parm min - the lowerest of the range 
	 * @parm max - the highest of the range
	 * @return sum of int between the min and max range
	 */
	
	public static int sumRange(int min, int max) {
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	/* #5 Write a method called maxOfTwo that accepts two 
	 * integer parameters and returns the larger of the two.
	 * 
	 * @param number1 first number, number2 the second number
	 * @return larger of the two values
	 */
	
	public static int maxOfTwo(int number1, int number2) {
		int largestNumber;
		if(number1 > number2) {
			largestNumber = number1;
		
		}else {
			largestNumber = number2;
		}
		return largestNumber;
	}
	
	/* 
	 *  #6 Write a method called larger that accepts two floating point 
	 *  parameters (of type double) and returns true if the first
	 *  parameter is greater than the second, and false otherwise.*
	 *  
	 * */
	
	public static boolean larger(double a, double b) {
		boolean result;
		if (a > b) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	/*
	 *  #7 Write a method called countA that accepts a String parameter 
	 *  and returns the number of times the letter 'A' is found in the string.
	 */
	
	public static int countA(String incoming) {
		int count=0;
		String capString = incoming.toUpperCase();
		for (int i = 1; i < capString.length(); i++) {
			if (capString.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}
	
	/* 
	 *  #8 Write a method called evenlyDivisible that accepts two integer 
	 *  parameters and returns true if the first parameter is evenly divisible 
	 *  by the second, or vise versa, and false otherwise. 
	 *  You may assume that neither parameter is zero.
	 */
	
	public static boolean evenlyDivisible(int a, int b) {
		boolean result;
		if(a%b == 0 || b%a == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	/*
	 *  #9 Write a method called average that accepts three integer parameters
	 * and returns their average as a floating point value.
	 */
	
	public static float average(int no1, int no2, int no3) {
		float total = no1 + no2 + no3;
		float average = total/3;
		return average;
	}
	
	/*
	 *  #10 Overload the average method of the previous exercise such 
	 * that if four integers are provided as parameters, the method 
	 * returns the average of all four.
	 */
	
	public static float average(int no1, int no2, int no3, int no4) {
		float total = no1 + no2 + no3 + no4;
		float average = total/4;
		return average;
	}
	
	/*
	 *  #11 Overload the average method once more to accept five integer 
	 * parameters and return their average.
	 */
	
	public static float average(int no1, int no2, int no3, int no4, int no5) {
		float total = no1 + no2 + no3 + no4 + no5;
		float average = total/5;
		return average;
	}
	
	/*
	 * #12 Write a method called multiConcat that takes a String 
	 * and an integer as parameters, and returns a String that 
	 * is the parameter string concatenated with itself n number 
	 * of times (where n is the second parameter). For example, 
	 * if the parameters are "hi" and 4, the return value is "hihihihi".
	 */
	
	public static String multiConcat(String myWord, int noTimes) {
		String finalWord = myWord;
		for(int i = 1; i < noTimes; i++) {
			finalWord = finalWord + myWord;
		}
		return finalWord;
	}
	
	/*
	 * #13 Overload the multiConcat method from the previous example such 
	 * that if the integer parameter is not provided, the method returns 
	 * the string concatenated with itself. For example, if the parameter 
	 * is "test" the return value is "testtest".
	 */
	
	public static String multiConcat(String myWord) {
		String finalWord = myWord + myWord;
		//for(int i = 1; i < noTimes; i++) {
			//finalWord = finalWord + myWord;
		//}
		return finalWord;
	}
	
	/*
	 * #14 Write a method called isAlpha that accepts a character parameter 
	 * and returns true if that character is either an uppercase or lowercase 
	 * alphabetic letter.
	 */
	
	public static boolean isAlpha(char testChar) {
		boolean result = false;
		if((testChar >= 'a' && testChar <= 'z') || (testChar >= 'A' && testChar <= 'Z')) {
				result = true;
		}
		return result;
		}
	
	/*
	 * #15 Write a method called validate that accepts three integer parameters. 
	 * The first two parameters represent a range, and the purpose of the method 
	 * is to verify that the value of the third parameter is in that range. You 
	 * may assume that the first parameter is less than or equal to the second. 
	 * If the third parameter is not in the specified range, the method should 
	 * prompt the user and read a new value. This new value should be tested for 
	 * validity as well. The method should only return to the calling method once 
	 * a valid value has been obtained, and it should return the valid value.
	 */
	
	public static int validate(int lowRange, int highRange, int testNumber) {
		int validValue = -1;
		boolean Valid = false;
		// perform this loop as long as the test number is not in the range 
		// once number is in the range mark as valid and return the number to print
		while(!Valid) {
			if (testNumber >= lowRange && testNumber <= highRange) {
				validValue = testNumber;
				Valid = true;
			} else {
			   testNumber = getNewNumber();	
			}
		}
		return validValue;
	}
	
	/*
	 * This method will ask the user for a new number and return the new number
	 */
	
		public static int getNewNumber() {
				Scanner input = new Scanner(System.in);
				System.out.println("Number not between 1 and 100");
				System.out.println("Please enter a number between 1 and 100");
				int checkNumber = input.nextInt();
				return checkNumber;
	}
		
		/* 
		 *  #16 Write a method called floatEquals that accepts three floating point 
		 *  values as parameters. The method should return true if the first two 
		 *  parameters are essentially equal, within the tolerance of the third parameter
		 */
		
		public static boolean floatEquals(float firstNumber, float secondNumber, float tolerance) {
			boolean isEqual = false;
			float topFirstRange = firstNumber + tolerance; //sets the bottom of the tolerance for the first number
			float bottomFirstRange = firstNumber - tolerance; // sets the top of the tolerance for the first number
			float topSecondRange = secondNumber + tolerance; //sets the top of the tolerance for the second number
			float bottomSecondRange = secondNumber - tolerance;// sets the bottom of the tolerance for the second number
			// first checks if the numbers are actually equal then also checks if the bottom of the range for the second number
			// falls in the range between the top and bottom range of the first number, if so returns that is is equal within 
			// tolerances
			if (firstNumber == secondNumber || 
					(bottomSecondRange <= topFirstRange && bottomSecondRange >= bottomFirstRange )) {
				isEqual = true;
			}
			return isEqual;
		}
		
		/*
		 *  #17 Write a method called reverse that accepts a String as a parameter 
		 * and returns a String that contains the characters of the parameter in 
		 * reverse order. Note: there is actually a method in the String class that 
		 * performs this operation, but for the sake of this exercise you will write your own.
		 */
		public static String reverse(String startingString) {
			int count = startingString.length() - 1;
			String endingString = "";
			//System.out.println(count + " "+ startingString);
			for (int i = count; i >= 0; i--) {
				endingString = endingString + startingString.charAt(i) ;
			}
			return endingString;
		}
		
		/*
		 *  #18 Write a method called isIsoceles that accepts three integer parameters 
		 * that represent the lengths of the sides of a triangle. The method should 
		 * return true if the triangle is isosceles but not equilateral, meaning that 
		 * exactly two of the sides have an equal length, and false otherwise.
		 */
		
		public static boolean isIsosceles(int side1, int side2, int side3) {
			boolean isIsosceles = false;
			//if all three sides are equal is equilateral so return false - only 2 sides can be equal
			if (!(side1 == side2 && side2 == side3)) {
				// if any of the two sides are equal will be an isosceles triangle - return true
				if (side1 == side2 || side1 == side3 || side2 == side3) {
					isIsosceles  = true;
				}
			}
			return isIsosceles;
		}
		
		/*
		 * #19 Write a method called randomInRange that accepts two integer parameters 
		 * representing a range. You may assume that the first parameter is less than or equal 
		 * to the second, and that both are positive. The method should return a random 
		 * integer in the specified range.
		 */
		
		public static int randomInRange(int number1, int number2) {
			int randomInteger = ThreadLocalRandom.current().nextInt(number1, number2);
			return randomInteger;
		}
		
		/*
		 * #20 Overload the randomInRange method of the previous exercise such 
		 * that if only one parameter is provided, the range is assumed to be from 1 
		 * to that value. You may assume the parameter value is positive.
		 */
		
		public static int randomInRange(int number1) {
			int randomInteger = ThreadLocalRandom.current().nextInt(1, number1);
			return randomInteger;
		}
		
		/*
		 * #21 Write a method called randomColor that creates and returns a Color 
		 * object that represents a random color. Recall that a Color object can be 
		 * defined by three integer values between 0 and 255 representing the 
		 * contributions of red, green, and blue (its RGB value).
		 */
		
//		public static obj randomColor() {
//			
//		}
}


# class-work
# class-work
