/*
 *Program Name:	DisplayDigits.java
 *Author:		Alex Liu
 *Date:		    January 24, 2021
 *Course:		CPSC 1150 - W05
 *Instructor:	Leo Pan
*/

import java.util.Scanner;

// Purpose: To get an integer between 0 and 999, then find and display the three digits in the number. The program also calculates and displays the sum of the three digits. 

public class DisplayDigits {

    // Main method
    public static void main(String[] args) {

        // Get a number between 0 and 999.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 999: ");
        String numberS = scanner.next();
        scanner.close();        
        
        // Use split function to seperate number to digits and store them into string array
        String[] numberA = numberS.split("");
        
        // Loop through array to print each digit in line on the console, and calculate sum of the digits 
        Integer sum = 0;
        System.out.print("The three digits numbers are: ");
        for (int i = 0; i<numberA.length; i++){
            Integer digit = Integer.parseInt(numberA[i]);
            System.out.print(digit + " ");
            sum += digit;
        }

        // Move the cursor to a new line and print the sum 
        System.out.println("");
        System.out.print("The sum of the three digits is: " + sum);
    }
}
