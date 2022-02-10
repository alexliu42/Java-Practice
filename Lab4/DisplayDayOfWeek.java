/*
 *Program Name:	DisplayDayOfWeek.java
 *Author:		Alex Liu
 *Date:		    Feburary 06, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

// Purpose: To display the corresponding day of the week on the console based on the integer between 0 and 6 entered by user

public class DisplayDayOfWeek{

    // Main method
    public static void main(String[] args) {

        // Get an integer between 0 and 6 from console.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer between 0 and 6: ");
        Integer number = scanner.nextInt();
        scanner.close();
        
        //Find which case matches the number entered by user
        switch(number){

            //If month matches 0 then printing out Sunday on the console, and break from switch   
            case 0:
                System.out.print("The corresponding day of the week is: ");
                System.out.println("Sunday");
                break;
            
            //If month matches 1 then printing out Monday on the console, and break from switch               
            case 1:
                System.out.print("The corresponding day of the week is: ");
                System.out.println("Monday");
                break;

            //If month matches 2 then printing out Tuesday on the console, and break from switch   
            case 2:
                System.out.print("The corresponding day of the week is: ");
                System.out.println("Tuesday");
                break;
            
            //If month matches 3 then printing out Wednesday on the console, and break from switch   
            case 3:
                System.out.print("The corresponding day of the week is: "); 
                System.out.println("Wednesday");
                break;
            
            //If month matches 4 then printing out Thursday on the console, and break from switch   
            case 4:
                System.out.print("The corresponding day of the week is: ");
                System.out.println("Thursday");
                break;

            //If month matches 5 then printing out Friday on the console, and break from switch   
            case 5:
                System.out.print("The corresponding day of the week is: ");
                System.out.println("Friday");
                break;

            //If month matches 6 then printing out Saturday on the console, and break from switch   
            case 6:
                System.out.print("The corresponding day of the week is: ");
                System.out.println("Saturday");
                break;

            //If input is not a number between 0 - 6 then shows error message
            default:
                System.out.println("Error: invalid input, please enter an integer between 0 and 6");
        }
    }
}