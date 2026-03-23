/**
 * File: If statements
 * Author: Mr. Kalisz
 * Date Created: Mar 23, 2026
 * Date Last Modified: Mar 23, 2026
 */


import java.util.Scanner;

class Notes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;

		System.out.print("Input a number greater than 5: ");
		num = input.nextInt();

		//if (boolean expression) {}
		//do not put a semi colon after your if statement
		if (num > 5) {
			//This area only runs when the boolean value is true
			System.out.println(num + " is greater than 5");
			// System.out.println("line 2");
		}

		if (num < 5) {
			System.out.println(num + " is less than 5");
		}

		System.out.println("Rest of our code");

		String word;
		word = "Bye";
		
		if (word.equals("Bye")) {
			System.out.println(word + " is equal to Bye");
			String word2; //local variable - only exists in this if statement
			word2 = "Bye";
			System.out.println(word.equals(word2));
		}

		// System.out.println(word2); //can't use word2, becuase it was local to the if statement and does not exist as far as java is concerned here.

		
	}
}
