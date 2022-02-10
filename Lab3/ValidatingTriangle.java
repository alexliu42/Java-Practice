/*
 *Program Name:	ValidatingTriangle.java
 *Author:		Alex Liu
 *Date:		    January 30, 2021
 *Course:		CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

// Purpose: To read three edges for a triangle and determine whether the input is valid.

public class ValidatingTriangle{
    
    // Main method
    public static void main(String[] args) {
        
        // Get the input of three edges for a triangle from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first edge length: ");
        Double firstEdge = scanner.nextDouble();
        System.out.print("Enter the second edge length: ");
        Double secondEdge = scanner.nextDouble();
        System.out.print("Enter the third edge length: ");
        Double thirdEdge = scanner.nextDouble();
        
        // Determine whether the input is valid. The sum of any two edges has to be greater than the third edge.
        Boolean test = firstEdge + secondEdge > thirdEdge && firstEdge < secondEdge + thirdEdge && firstEdge + thirdEdge > secondEdge;
        
        // Display the boolean output on the console
        System.out.print("Can edges " + firstEdge + ", " + secondEdge + ", and " + thirdEdge + " form a triangle? " + test); 
        scanner.close(); 
    }
}