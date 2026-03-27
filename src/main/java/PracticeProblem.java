/*File: Pratice Problem 3.1
Author: Kaveeshan Sathasivam
Date Created: Mar 26, 2026
Date Last Modified: Mar 26, 2026

*/

public class PracticeProblem {

    public static void main(String args[]) {
        System.out.println(evenOrOdd(5)); // test call
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        if (number % 2 != 0) {
            return "Odd";
        }
        return "";
    }

	 public static String teacherOrStudent(String name) {
        if (name.equals("Kalisz")) {
            return "Teacher";
        }
        if (!name.equals("Kalisz")) {
            return "Student";
        }
        return "";
    }

	 public static int fartherFromZero(int number) {
        if (number > 0) {
            return number + 5;
        }
        if (number < 0) {
            return number - 5;
        }
        if (number == 0) {
            return 0;
        }
        return 0;
    }
}