/*
 *Program Name:	FindMiddleName.java
 *Author:		Alex Liu
 *Date:		    Feburary 21, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

// Purpose: To find and display the middle name of the person based on the full name entered in order from the console

public class FindMiddleName{

    // Main method
    public static void main(String[] args) {
        
        // Obtain a name in order from console
        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();

        // Store the split names into array using split function
        String[] names= name.split(" ");
        
        // Display the middle name
        System.out.print("Your middle name is: ");        
        System.out.print(names[1]);
    }
}


