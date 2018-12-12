package checkAge;

import java.util.Scanner;

public class checkAge {
	/**
	 * This is a program that will have the user input an age and 
	 * will then output a message depending on the age entered.
	 * 
	 * @param age
	 */

	public static void main(String[] args) {
		//get age from user
		Scanner input = new Scanner(System.in);
		//int age;
		System.out.println("What is your age? ");
		int age = input.nextInt();
		
		// determine output depending on age
		if (age <= 17) {
			//you're too young to anthing
			System.out.println("You are too young to be President of the"
					+ " United States ( too bad!)");
			System.out.println("You are too young to drink alcohol!");
			System.out.println("You are too young to get a tattoo!");
		}
		else if (age < 21){
			// you can get a tattoo but thats about it
			System.out.println("You are too young to be President of the"
					+ " United States ( too bad!)");
			System.out.println("You are too young to drink alcohol!");
		}
		else if (age < 35) {
			// you can do most anything except be President
			System.out.println("You are too young to be President of the"
					+ " United States ( too bad!");
		}
		else {
			// You are lucky enough to have lived long enough to do about anything
			System.out.println("You are old enough to do anything you wish!");
		}
		
	}

}
# Class-activities
# class-work exercise1.txt
# class-work exercise1.txt
# class-work exercise1.txt
# class-work exercise1.txt
# class-work exercise1.txt
