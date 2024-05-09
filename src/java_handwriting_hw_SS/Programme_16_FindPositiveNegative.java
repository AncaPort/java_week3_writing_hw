package java_handwriting_hw_SS;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme_16_FindPositiveNegative {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        findNumbersIsPositiveNegativeOrZero(number);
        //closing the scanner object
        scanner.close();
    }

    //finding the number is positive negative or zero
    public static void findNumbersIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number");
        } else {
            System.out.println(number + " is a ZERO");
        }
    }
}
