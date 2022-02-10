/*
 *Program Name:	CheckBMI.java
 *Author:		Alex Liu
 *Date:		    January 30, 2021
 *Course:		CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

// Purpose: To get a person's weight (kg) and height (m) from the keyboard, then caluclate and display the person's BMI (keep two decimals) and the status message on the console. 

public class CheckBMI {
    
    // Main method
    public static void main(String[] args) {
        
        // Get a person's weight (kg) height (m) from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Please enter your height in meters: ");
        double height = scanner.nextDouble();
        scanner.close();

        // Determine if the weight or the height is not positive, display an appropriate error message on the console before exiting the program.
        if (weight < 0 || height < 0){
            System.out.print("Error: height and weight must be positive");
            return;
        }

        // Calculate and the person's BMI 
        double bmi = weight / Math.pow(height,2);
        
        // Display the person's BMI on the console (keep two digits after the decimal point)
        System.out.print("Your BMI is: ");
        System.out.printf("%.2f",bmi);
        System.out.println("");
        
        // Categorize the person's BMI and display the status message on the console.
        if (bmi < 20){
            System.out.println("You are underweight");
        }
        else if (bmi > 25){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("Your BMI is normal");

        }
        
    }
}
