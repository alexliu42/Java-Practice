/*
 *Program Name:	DaysInMonth.java
 *Author:		Alex Liu
 *Date:		    Feburary 06, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

// Purpose: To find the number of days in a month based on the month in number and year entered by user.

public class DaysInMonth {

    // Main method
    public static void main(String[] args){
    
        // Get a month in number and a year from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a month in number and a year: ");
        Integer month = scanner.nextInt();
        Integer year = scanner.nextInt();            
        scanner.close();
        
        //Find which case matches the month entered by user
        switch (month){

            //If month matches 1 then printing out January information on the console, and break from switch   
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;

            //If month matches 2 then determine whether the year is a leap year
            //A leap year should be evenly divided by 4 and not evenly divided by 100 unless it is also evenly divided by 400
            //Printing out associated information from Feburary
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0 )){
                    System.out.println("February " + year + " has 29 days");
                    System.out.println("It's a leap year!");
                }
                else{
                    System.out.println("February " + year + " has 28 days");
                }
                break;
            
            //If month matches 3 then printing out Match information on the console, and break from switch   
            case 3:
                System.out.println("March " + year + " has 31 days");
                break;

            //If month matches 4 then printing out April information on the console, and break from switch       
            case 4:
                System.out.println("April " + year + " has 30 days");
                break;
            
            //If month matches 5 then printing out May information on the console, and break from switch   
            case 5:
                System.out.println("May " + year + " has 31 days");
                break;

            //If month matches 6 then printing out June information on the console, and break from switch   
            case 6:
                System.out.println("June " + year + " has 30 days");
                break;

            //If month matches 7 then printing out July information on the console, and break from switch   
            case 7:
                System.out.println("July " + year + " has 31 days");    
                break;

            //If month matches 8 then printing out August information on the console, and break from switch   
            case 8:
                System.out.println("August " + year + " has 31 days");
                break;
            
            //If month matches 9 then printing out September information on the console, and break from switch   
            case 9:
                System.out.println("September " + year + " has 30 days");
                break;
            
            //If month matches 10 then printing out October information on the console, and break from switch   
            case 10:
                System.out.println("October " + year + " has 31 days");
                break;
            
            //If month matches 11 then printing out November information on the console, and break from switch   
            case 11:
                System.out.println("November " + year + " has 30 days");
                break;
            
            //If month matches 12 then printing out December information on the console, and break from switch   
            case 12:
                System.out.println("December " + year + " has 31 days");
        }
    }    
}
