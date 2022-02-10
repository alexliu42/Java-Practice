/*
 *Program Name:	CalculateBmi.java
 *Author:		Alex Liu
 *Date:		    January 24, 2021
 *Course:		CPSC 1150 - W05
 *Instructor:	Leo Pan
*/

import java.util.Scanner;

// Purpose: To get a person's weight (kg) and height (m) from the keyboard then calculate and display the person's BMI on the console (keep two digits after the decimal point)

public class CalculateBmi{

    // Main method
    public static void main(String[] args) {

        // Get a person's weight (kg) height (m) from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Please enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate and the person's BMI 
        double bmi = weight / Math.pow(height,2);

        // Display the person's BMI on the console (keep two digits after the decimal point)
        System.out.print("Your BMI is: ");
        System.out.printf("%.2f",bmi);
        scanner.close();
    }
}