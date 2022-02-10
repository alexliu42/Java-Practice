/*
 *Program Name:	Elevator.java
 *Author:		Alex Liu
 *Date:		    Feburary 21, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

// Purpose: To simulate the movement of an elevator.

public class Elevator {

    // Main method
    public static void main(String[] args) {
        
        //Initialize variables for floor origin and destination to dynamically print out later
        Integer floorTo = 1;
        Integer floorFrom = 1;
        
        // First output displays elevator is at first floor
        System.out.println("o-------o");
        System.out.println("|    "+floorTo+"  |");
        System.out.println("o-------o");
        System.out.println("The elevaotr is at Floor " +floorTo+ " now"); 
               
        // Elevator model with requring condtions
        while(true){

            // Repeatedly asking for user input 
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a floor number between 1 and 9, or enter 0 to quit: ");
            floorTo =  scanner.nextInt();
            
            // Display invalid message and promt for input repeatedly when input is not between 0 and 9
            while (floorTo > 9 || floorTo < 0){
                System.out.println("Invalid floor number. Try again.");
                System.out.print("Enter a floor number between 1 and 9, or enter 0 to quit: ");    
                floorTo =  scanner.nextInt();
            }

            // Terminate the program when input is zero with corresponding message
            if (floorTo == 0){
                System.out.print("Thank you for using the elevator program. Goodbye!");
                return;
            }

            /* Display the going up message when the floor destination is greater than floor origin 
               Display the going down message when the floor destination is less than floor origin
            */
            if (floorTo > floorFrom){
                System.out.println("The elevator is moving up from Floor "+floorFrom + " to " + floorTo);
                for (int i = floorTo; i >= floorFrom; i--){
                    System.out.println("o-------o   /\\");
                    System.out.println("|    "+i+"  |  //\\\\");
                    System.out.println("o-------o //  \\\\");
                }
            }
            else if (floorTo < floorFrom){
                System.out.println("The elevator is moving down from Floor "+floorFrom + " to " + floorTo);
                for (int i = floorFrom; i >= floorTo; i--){
                    System.out.println("o-------o \\\\  //");
                    System.out.println("|    "+i+"  |  \\\\//");
                    System.out.println("o-------o   \\/");
                }
            }

            // Update the current flooor
            floorFrom = floorTo;

            // Display the updated floor
            System.out.println("The elevaotr is at Floor " +floorTo+ " now");             
        }        
    }   

}