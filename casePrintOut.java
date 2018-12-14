package casePrintOut;

import java.util.Scanner;

public class casePrintOut {

	public static void main(String[] args) {
		// open Scanner to accept input
		Scanner input = new Scanner(System.in);
		//define variable
		int caseNumber;
		String caseOutput = "";
		// Ask the user what number they wish to use
		System.out.println("What case would you like to use (1 - 10)? ");
		// receive the input from user
		caseNumber = input.nextInt();
		// call the method to find case number
		caseOutput = checkCase(caseNumber);
		//print out case number
		System.out.println(caseOutput);
	}
	
	public static String checkCase(int caseNumber) {
		String caseOutput = "";
		
		switch(caseNumber) {
			case 1:
				caseOutput = "Case number 111111";
				break;
			case 2:
				caseOutput = "Case number 222222";
				break;
			case 3:
				caseOutput = "Case number 333333";
				break;
			case 4:
				caseOutput = "Case number 444444";
				break;
			case 5:
				caseOutput = "Case number 555555";
				break;
			case 6:
				caseOutput = "Case number 666666";
				break;
			case 7:
				caseOutput = "Case number 777777";
				break;
			case 8:
				caseOutput = "Case number 888888";
				break;
			case 9:
				caseOutput = "Case number 999999";
				break;
			case 10:
				caseOutput = "Case number 1000000";
				break;
			default:
				caseOutput = "Not a valid number";
				break;
		}
		
		return caseOutput;
	}

}
# class-work
# class-work
# class-work
# class-work
